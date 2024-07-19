package Utilities;

public enum BrowserType {
	CHROME("chrome"), FIREFOX("firefox"), EDGE("edge"), IE("ie");
	 
	private String type;
 
	BrowserType(String browserType) {
		this.type = browserType;
 
	}
 
	public String getType() {
		return type;
	}
}
