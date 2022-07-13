package app;

public enum Cores {

	COR1("#FFDADA"), COR2("#FFB0B0"), COR3("#FF7F7F"), COR4("#FF3C3C"), COR5("#FF0B0B");
	
	Cores(String rgb){
		this.rgb = rgb;
	}
	
	public String getRgb() {
		return this.rgb;
	}

	private String rgb;
}
