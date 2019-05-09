package Cassia;

public enum RemoteMessageBoxOptions {
  None(0L),
  SetForeground(65536L),
  RightAligned(524288L),
  RtlReading(1048576L),
  ;
  private long numVal;

  RemoteMessageBoxOptions(long numVal) {
    this.numVal = numVal;
  }

  public long getNumVal() {
    return numVal;
  }
}
