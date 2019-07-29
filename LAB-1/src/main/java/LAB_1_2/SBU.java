package LAB_1_2;

public class SBU {
	 private String sbuid;
	 private String sbuname;
	 private String sbuhead;
	 public String getSbuid() {
	 return sbuid;
	 }

	 public void setSbuid(String sbuid) {
	 this.sbuid = sbuid;
	 }

	 public String getSbuname() {
	 return sbuname;
	 }

	 public void setSbuname(String sbuname) {
	 this.sbuname = sbuname;
	 }

	 public String getSbuhead() {
	 return sbuhead;
	 }

	 public void setSbuhead(String sbuhead) {
	 this.sbuhead = sbuhead;
	 }

	 @Override
	 public String toString() {
	 return "SBU [sbuid=" + sbuid + ", sbuname=" + sbuname + ", sbuhead="
	  + sbuhead + "]";
	 
	 }
}
