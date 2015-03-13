package shedar.mods.ic2.nuclearcontrol.crossmod;

public class EnergyStorageData {
	public static final int TARGET_TYPE_UNKNOWN = -1;
	public static final int TARGET_TYPE_IC2 = 0;
	public static final int TARGET_TYPE_RF = 1;
	
	public static final String UNITS_EU = "EU";
	public static final String UNITS_RF = "RF";

	public double stored;
	public double capacity;
	public String units;
	public int type;

}
