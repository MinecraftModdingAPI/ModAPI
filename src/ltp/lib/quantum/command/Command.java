package ltp.lib.quantum.command;

import java.util.List;

/**
 * @author PizzaCrust
 * TODO: Add all methods in vanilla class.
 */
public interface Command {
    /**
     * The name of the command. Already includes a slash at the beginning of the command.
     * @return the command name
     */
    String getCommandName();

    /**
     * Retrieves the command usage of the command.
     * @param sender the sender of the command
     * @return the usage
     * Example: "/<command-name> <cmd-parameter>"
     */
    String getCommandUsage(CommandSender sender);

    /**
     * Retrieves the aliases of the command.
     * @return the aliases
     */
    String[] getCommandAliases();

    /**
     * Called when the command is executed.
     * @param sender the sender
     * @param args the arguments the sender provided
     */
    void onCall(CommandSender sender, String[] args);

    /**
     * Determines if the sender of the command can execute the command.
     * @return the bool
     */
    boolean isPermitted(CommandSender sender);

    /**
     * Determines if the specified argument index is a username index.
     * @param args the arguments
     * @param index the index
     * @return the bool
     */
    boolean isUsernameIndex(String[] args, int index);

    /**
     * Wraps a NMS command -> API command.
     * @param iCommand the NMS command
     * @return the API command
     */
    static Command wrap(net.minecraft.command.ICommand iCommand) {
        return new Command() {
            @Override
            public String getCommandName() {
                return iCommand.getName();
            }

            @Override
            public String getCommandUsage(CommandSender sender) {
                if (sender instanceof CommandSender.WrappedSender) {
                    return iCommand.getCommandUsage(((CommandSender.WrappedSender) sender).getHandle());
                }
                return null;
            }

            @Override
            public String[] getCommandAliases() {
                return ((List<String>) iCommand.getAliases()).toArray(new String[iCommand.getAliases().size()]);
            }

            @Override
            public void onCall(CommandSender sender, String[] args) {
                if (sender instanceof CommandSender.WrappedSender) {
                    CommandSender.WrappedSender wrappedSender = (CommandSender.WrappedSender) sender;
                    iCommand.execute(wrappedSender.getHandle(), args);
                }
            }

            @Override
            public boolean isPermitted(CommandSender sender) {
                if (sender instanceof CommandSender.WrappedSender) {
                    return iCommand.canCommandSenderUse(((CommandSender.WrappedSender) sender).getHandle());
                }
                return false;
            }

            @Override
            public boolean isUsernameIndex(String[] args, int index) {
                return iCommand.isUsernameIndex(args, index);
            }
        };
    }
}
