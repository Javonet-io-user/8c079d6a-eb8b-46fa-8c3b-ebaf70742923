package Cassia;

public enum ConnectionState {
  Active(0L),
  Connected(1L),
  ConnectQuery(2L),
  Shadowing(3L),
  Disconnected(4L),
  Idle(5L),
  Listening(6L),
  Reset(7L),
  Down(8L),
  Initializing(9L),
  ;
  private long numVal;

  ConnectionState(long numVal) {
    this.numVal = numVal;
  }

  public long getNumVal() {
    return numVal;
  }
}
