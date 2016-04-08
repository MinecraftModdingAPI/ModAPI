package ltp.lib.quantum.command;

import ltp.lib.quantum.meta.WIP;
import net.minecraft.command.CommandHandler;
import net.minecraft.command.ICommand;
import net.minecraft.command.ICommandManager;
import net.minecraft.command.ICommandSender;
import net.minecraft.util.BlockPos;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author PizzaCrust
 */
@WIP
public interface CommandManager {
    /**
     * Executes a command via the command sender.
     * @param commandSender the command sender
     * @param rawCommand the raw command
     */
    void executeCommand(CommandSender commandSender, String rawCommand);

    /**
     * Retrieves all permittable commands that the sender can execute.
     * @param sender the sender
     * @return the array of commands
     */
    Command[] getPossibleCommands(CommandSender sender);

    /**
     * Registers a API command.
     * @param command the command
     */
    void registerCommand(Command command);

    /**
     * A wrapped NMS command manager & command handler.
     * @author PizzaCrust
     */
    class WrappedManager implements CommandManager {
        private ICommandManager iCommandManager;

        public WrappedManager(ICommandManager commandManager) {
            this.iCommandManager = commandManager;
        }

        @Override
        public void executeCommand(CommandSender commandSender, String rawCommand) {
            if (commandSender instanceof CommandSender.WrappedSender) {
                this.iCommandManager.executeCommand(((CommandSender.WrappedSender) commandSender).getHandle(), rawCommand);
            }
        }

        @Override
        public Command[] getPossibleCommands(CommandSender sender) {
            List<Command> commandList = new ArrayList<>();
            CommandSender.WrappedSender wrappedSender = (CommandSender.WrappedSender) sender;
            List<ICommand> iCommands = (List<ICommand>) this.iCommandManager.getPossibleCommands(wrappedSender.getHandle());
            for (ICommand command : iCommands) {
                commandList.add(Command.wrap(command));
            }
            return commandList.toArray(new Command[commandList.size()]);
        }

        @Override
        public void registerCommand(Command command) {
            CommandHandler commandHandler = (CommandHandler) iCommandManager;
            commandHandler.registerCommand(new ICommand() {
                @Override
                public String getName() {
                    return command.getCommandName();
                }

                @Override
                public String getCommandUsage(ICommandSender iCommandSender) {
                    return command.getCommandUsage(new CommandSender.WrappedSender(iCommandSender));
                }

                @Override
                public List getAliases() {
                    return Arrays.asList(command.getCommandAliases());
                }

                @Override
                public void execute(ICommandSender iCommandSender, String[] strings) {
                    command.onCall(new CommandSender.WrappedSender(iCommandSender), strings);
                }

                @Override
                public boolean canCommandSenderUse(ICommandSender iCommandSender) {
                    return command.isPermitted(new CommandSender.WrappedSender(iCommandSender));
                }

                @Override
                public List addTabCompletionOptions(ICommandSender iCommandSender, String[] strings, BlockPos blockPos) {
                    return null;
                }

                @Override
                public boolean isUsernameIndex(String[] strings, int i) {
                    return command.isUsernameIndex(strings, i);
                }

                @Override
                public int compareTo(Object o) {
                    return 0;
                }
            });
        }
    }
}
