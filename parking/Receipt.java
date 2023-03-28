package parking;

import java.time.LocalDateTime;

public class Receipt {
  private float fee;
  private LocalDateTime startTime;
  private LocalDateTime endTime;

  public float getFee() {
    return fee;
  }

  public LocalDateTime getStartTime() {
    return startTime;
  }

  public LocalDateTime getEndTime() {
    return endTime;
  }
}
