package cn.ks.android.packageinfo.entity;

import java.util.ArrayList;

public class ApkInfoEntity {

	public String versionCode = "";
	public String versionName = "";
	public String packageName = "";
	public String signature = "";
	public String minSdkVersion = "";
	public String targetSdkVersion = "";
	public ArrayList<String> permissions = new ArrayList<String>();
	
	@Override
	public String toString(){
		StringBuilder sb = new StringBuilder();
		sb.append("  包名: " + packageName + "\n");
		sb.append("  版本名: " + versionName + "\n");
		sb.append("  版本号: " + versionCode + "\n");
		sb.append("  签名文件MD5: " + signature + "\n");
		sb.append("  SDK版本:\n");
		sb.append("      minSdkVersion:" + minSdkVersion + "\n");
		sb.append("      targetSdkVersion:" + targetSdkVersion + "\n");
		return sb.toString();
	}
	
}
