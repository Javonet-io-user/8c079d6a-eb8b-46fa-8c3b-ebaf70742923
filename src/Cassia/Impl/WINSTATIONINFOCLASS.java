package Cassia.Impl;

public enum WINSTATIONINFOCLASS {
  WinStationCreateData(0L),
  WinStationConfiguration(1L),
  WinStationPdParams(2L),
  WinStationWd(3L),
  WinStationPd(4L),
  WinStationPrinter(5L),
  WinStationClient(6L),
  WinStationModules(7L),
  WinStationInformation(8L),
  WinStationTrace(9L),
  WinStationBeep(10L),
  WinStationEncryptionOff(11L),
  WinStationEncryptionPerm(12L),
  WinStationNtSecurity(13L),
  WinStationUserToken(14L),
  WinStationUnused1(15L),
  WinStationVideoData(16L),
  WinStationInitialProgram(17L),
  WinStationCd(18L),
  WinStationSystemTrace(19L),
  WinStationVirtualData(20L),
  WinStationClientData(21L),
  WinStationSecureDesktopEnter(22L),
  WinStationSecureDesktopExit(23L),
  WinStationLoadBalanceSessionTarget(24L),
  WinStationLoadIndicator(25L),
  WinStationShadowInfo(26L),
  WinStationDigProductId(27L),
  WinStationLockedState(28L),
  WinStationRemoteAddress(29L),
  WinStationIdleTime(30L),
  WinStationLastReconnectType(31L),
  WinStationDisallowAutoReconnect(32L),
  WinStationUnused2(33L),
  WinStationUnused3(34L),
  WinStationUnused4(35L),
  WinStationUnused5(36L),
  WinStationReconnectedFromId(37L),
  WinStationEffectsPolicy(38L),
  WinStationType(39L),
  WinStationInformationEx(40L),
  ;
  private long numVal;

  WINSTATIONINFOCLASS(long numVal) {
    this.numVal = numVal;
  }

  public long getNumVal() {
    return numVal;
  }
}
