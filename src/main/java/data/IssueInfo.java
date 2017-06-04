package data;

/**
 * Created by matanghao1 on 3/6/17.
 */
public class IssueInfo {
    private String severity;
    private String message;

    public IssueInfo(String severity, String message) {
        this.severity = severity;
        this.message = message;
    }

    public String getMessage() {

        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getSeverity() {

        return severity;
    }

    public void setSeverity(String severity) {
        this.severity = severity;
    }
}

