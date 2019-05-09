package Cassia.Impl;

public enum WTS_INFO_CLASS {
  WTSInitialProgram(0L),
  WTSApplicationName(1L),
  WTSWorkingDirectory(2L),
  WTSOEMId(3L),
  WTSSessionId(4L),
  WTSUserName(5L),
  WTSWinStationName(6L),
  WTSDomainName(7L),
  WTSConnectState(8L),
  WTSClientBuildNumber(9L),
  WTSClientName(10L),
  WTSClientDirectory(11L),
  WTSClientProductId(12L),
  WTSClientHardwareId(13L),
  WTSClientAddress(14L),
  WTSClientDisplay(15L),
  WTSClientProtocolType(16L),
  WTSIdleTime(17L),
  WTSLogonTime(18L),
  WTSIncomingBytes(19L),
  WTSOutgoingBytes(20L),
  WTSIncomingFrames(21L),
  WTSOutgoingFrames(22L),
  WTSSessionInfo(24L),
  ;
  private long numVal;

  WTS_INFO_CLASS(long numVal) {
    this.numVal = numVal;
  }

  public long getNumVal() {
    return numVal;
  }
}
