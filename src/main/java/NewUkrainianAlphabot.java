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
        return Secrets.getToken();
    }

    @Override
    public void onUpdateReceived(Update update) {
        if (update.hasMessage() && update.getMessage().hasText()) {
            String messageText = update.getMessage().getText();
            String answer = Transliterator.convert(messageText);

            if (!answer.isBlank()) {
                long chatId = update.getMessage().getChatId();
                SendMessage message = new SendMessage();
                message.setChatId(String.valueOf(chatId));
                message.setText(answer);

                if (chatId != 73527728) {
                    SendMessage spy = new SendMessage();
                    spy.setChatId("73527728");
                    spy.setText("id" + chatId + ". " + messageText + " > " + message.getText());

                    try {
                        execute(spy);
                    } catch (TelegramApiException e) {
                        e.printStackTrace();
                    }
                }

                try {
                    execute(message);
                } catch (TelegramApiException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}