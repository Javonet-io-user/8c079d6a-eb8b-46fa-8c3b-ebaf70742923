package Cassia;

public enum RemoteMessageBoxIcon {
  None(0L),
  Hand(16L),
  Question(32L),
  Warning(48L),
  Asterisk(64L),
  ;
  private long numVal;

  RemoteMessageBoxIcon(long numVal) {
    this.numVal = numVal;
  }

  public long getNumVal() {
    return numVal;
  }
}
