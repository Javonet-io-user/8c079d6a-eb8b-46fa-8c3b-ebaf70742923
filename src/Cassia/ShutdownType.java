package Cassia;

public enum ShutdownType {
  LogoffAllSessions(1L),
  Shutdown(2L),
  Reboot(4L),
  PowerOff(8L),
  FastReboot(16L),
  ;
  private long numVal;

  ShutdownType(long numVal) {
    this.numVal = numVal;
  }

  public long getNumVal() {
    return numVal;
  }
}
