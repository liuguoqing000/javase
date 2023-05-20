package exception;

public class ExceptionCustom {
    public static void main(String[] args) {
        int age = 100;
        if (age > 100) {
            throw new ageException("年龄不合理！");
        }
        System.out.println("河里");
    }
}

class ageException extends RuntimeException {
    public ageException(String message) {
        super(message);
    }
}
