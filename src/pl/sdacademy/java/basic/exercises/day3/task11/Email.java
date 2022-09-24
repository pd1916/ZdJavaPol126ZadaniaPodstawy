package pl.sdacademy.java.basic.exercises.day3.task11;

public class Email {
    private String receiver;
    private String title;
    private String bodyMsg;
    private String attachment;

    public Email(Builder b) {
        this.receiver = b.receiver;
        this.title = b.title;
        this.bodyMsg = b.bodyMsg;
        this.attachment = b.attachment;
    }

    @Override
    public String toString() {
        return "Email{" +
                "receiver='" + receiver + '\'' +
                ", title='" + title + '\'' +
                ", bodyMsg='" + bodyMsg + '\'' +
                ", attachment='" + attachment + '\'' +
                '}';
    }

    public static class Builder {
        private String receiver;
        private String title;
        private String bodyMsg;
        private String attachment;

        public Builder receiver(String receiver) {
            this.receiver = receiver;
            return this;
        }

        public Builder title(String title) {
            this.title = title;
            return this;
        }

        public Builder bodyMsg(String bodyMsg) {
            this.bodyMsg = bodyMsg;
            return this;
        }

        public Builder attachment(String attachment) {
            this.attachment = attachment;
            return this;
        }

        public Email build() {
            return new Email(this);
        }
    }
}