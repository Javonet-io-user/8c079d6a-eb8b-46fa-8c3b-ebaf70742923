package Cassia;

public enum RemoteMessageBoxDefaultButton {
  Button1(0L),
  Button2(256L),
  Button3(512L),
  Button4(768L),
  ;
  private long numVal;

  RemoteMessageBoxDefaultButton(long numVal) {
    this.numVal = numVal;
  }

  public long getNumVal() {
    return numVal;
  }
}
