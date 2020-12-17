package android.packageinfo;

import android.packageinfo.entity.ApkInfoEntity;
import android.packageinfo.getSignature.GetSignature;
import android.packageinfo.utils.ApkUtil;
/**
 * @author Kevin
 */
public class ApkInfo {


	private static boolean sShowDebug = true;
	private static final int RET_GET_INFO_BAD = -3;
	public static void main(String[] params) {
        String filePath = "C:\\Users\\XKd\\Downloads\\Android-GetAPKInfo-master\\IBUAdPlayer_V.apk";
		getApkInfo(filePath);
    } 
	
	private static ApkInfoEntity getApkInfo(String filePath){
		ApkInfoEntity info = new ApkInfoEntity();
		try {
			ApkUtil.getApkInfo(filePath, info, sShowDebug);
		} catch(Exception e){
			showFailedCheckResult(RET_GET_INFO_BAD,"get apkinfo failed, throw an Exception ;please use --debug get more info");
			return null;
		}
		try{
			info.signature = GetSignature.getApkSignInfo(filePath, sShowDebug);
		}catch(Exception e){
			showFailedCheckResult(RET_GET_INFO_BAD,"get apk info failed, throw an Exception;please use --debug get more info");
			return null;
		}
		showSuccssedCheckResult(info);
		return info;
	}

	private static void showSuccssedCheckResult(ApkInfoEntity info){
		System.out.println("执行结果: 成功"); 
		System.out.println("应用信息: \n" + info.toString());
	}
	
	private static void showFailedCheckResult(int ret,String Msg){
		System.out.println("执行结果: 失败("+ ret+")"); 
		System.out.println("错误信息:" + Msg);
	}
}
