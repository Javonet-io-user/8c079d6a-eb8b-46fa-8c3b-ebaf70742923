package Cassia;

public enum RemoteMessageBoxButtons {
  Ok(0L),
  OkCancel(1L),
  AbortRetryIgnore(2L),
  YesNoCancel(3L),
  YesNo(4L),
  RetryCancel(5L),
  ;
  private long numVal;

  RemoteMessageBoxButtons(long numVal) {
    this.numVal = numVal;
  }

  public long getNumVal() {
    return numVal;
  }
}
