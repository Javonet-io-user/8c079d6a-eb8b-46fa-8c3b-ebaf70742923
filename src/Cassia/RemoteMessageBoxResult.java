package Cassia;

public enum RemoteMessageBoxResult {
  Ok(1L),
  Cancel(2L),
  Abort(3L),
  Retry(4L),
  Ignore(5L),
  Yes(6L),
  No(7L),
  Timeout(32000L),
  Asynchronous(32001L),
  ;
  private long numVal;

  RemoteMessageBoxResult(long numVal) {
    this.numVal = numVal;
  }

  public long getNumVal() {
    return numVal;
  }
}
