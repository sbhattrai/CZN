package my.group.project.Service;

public class InvalidSuperTeamNameException extends RuntimeException {

    public InvalidSuperTeamNameException (String message) { super(message);}

    public InvalidSuperTeamNameException (String message, Throwable cause) {super(message, cause);}

}

