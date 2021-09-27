import org.telegram.telegrambots.bots.TelegramLongPollingBot;
import org.telegram.telegrambots.meta.api.methods.send.SendMessage;
import org.telegram.telegrambots.meta.api.objects.Update;
import org.telegram.telegrambots.meta.exceptions.TelegramApiException;

public class NewUkrainianAlphabot extends TelegramLongPollingBot {
    @Override
    public String getBotUsername() {
        return "New Ukrainian Alphabot";
    }

    @Override
    public String getBotToken() {
        return ${{secrets.TELEGRAM_BOT_TOKEN}};
    }

    @Override
    public void onUpdateReceived(Update update) {
        if (update.hasMessage() && update.getMessage().hasText()) {
            String message_text = update.getMessage().getText();
            long chat_id = update.getMessage().getChatId();

            SendMessage message = new SendMessage();
            message.setChatId(String.valueOf(chat_id));
            message.setText(Transliterator.convert(message_text));

            try {
                execute(message);
            } catch (TelegramApiException e) {
                e.printStackTrace();
            }
        }
    }

}
