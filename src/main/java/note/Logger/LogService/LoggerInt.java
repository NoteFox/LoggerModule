package note.Logger.LogService;

import java.io.IOException;

public interface LoggerInt {
    void addLogEntry(LogType type, String TAG, String message);
    String readLastEntry() throws IOException;
    void stopThread();
}
