package ltp.lib.quantum.command;

import ltp.lib.quantum.meta.WIP;
import net.minecraft.command.ICommandSender;
import net.minecraft.util.ChatComponentText;

/**
 * @author PizzaCrust
 * TODO: Make this more comprehensive.
 */
@WIP
public interface CommandSender {
    /**
     * Retrieves the username of the object.
     * @return the username
     */
    String getName();

    /**
     * Retrieves the formatted String of the sender's username in chat.
     * @return the formatted string
     */
    String getDisplayName();

    /**
     * Sends a chat message to the sender.
     * @param msg the message
     */
    void addChatMessage(String... msg);

    /**
     * Determines if the command sender can use the specified command.
     * @param permLevel the permission level
     * @param commandName the command name
     * @return the bool
     */
    boolean canCommandSenderUseCommand(int permLevel, String commandName);

    /**
     * A wrapped NMS sender.
     * @author PizzaCrust
     */
    class WrappedSender implements CommandSender {
        private ICommandSender iCommandSender;

        public WrappedSender(ICommandSender sender) {
            this.iCommandSender = sender;
        }

        @Override
        public String getName() {
            return iCommandSender.getName();
        }

        @Override
        public String getDisplayName() {
            return iCommandSender.getDisplayName().getFormattedText();
        }

        @Override
        public void addChatMessage(String... msg) {
            for (String m : msg) {
                iCommandSender.addChatMessage(new ChatComponentText(m));
            }
        }

        @Override
        public boolean canCommandSenderUseCommand(int permLevel, String commandName) {
            return iCommandSender.canUseCommand(permLevel, commandName);
        }

        /**
         * Retrieves the handle of the object.
         * @return the handle
         */
        public ICommandSender getHandle() {
            return iCommandSender;
        }
    }
}
