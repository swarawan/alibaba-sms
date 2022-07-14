import com.aliyuncs.CommonRequest
import com.aliyuncs.DefaultAcsClient
import com.aliyuncs.IAcsClient
import com.aliyuncs.http.MethodType
import com.aliyuncs.profile.DefaultProfile

fun main() {

    val regionId = "YOUR_REGION_ID"
    val accessKey = "YOUR_ACCESS_KEY"
    val secret = "YOUR_SECRET"

    val profile: DefaultProfile = DefaultProfile.getProfile(regionId, accessKey, secret)
    val client: IAcsClient = DefaultAcsClient(profile)
    val request: CommonRequest = CommonRequest().apply {
        sysMethod = MethodType.POST
        sysDomain = "dysmsapi.ap-southeast-1.aliyuncs.com" // don't change
        sysVersion = "2018-05-01" // don't change
        sysAction = "SendMessageToGlobe"

        putQueryParameter("To", "YOUR_PHONE_NUMBER")
        putQueryParameter("From", "YOUR_MASKING_NAME OR PHONE")
        putQueryParameter("Message", "YOUR MESSAGE")
        putQueryParameter("Type", "OTP")
    }

    try {
        val response = client.getCommonResponse(request)
        println(response.data)
    } catch (ex: Exception) {
        println(ex.printStackTrace())
    }

}