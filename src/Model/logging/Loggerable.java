package Model.logging;

import java.time.LocalDateTime;

public interface Loggerable<E> {
    void addLog(LocalDateTime time, String msg, E result);
}
