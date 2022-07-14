Simple snippet Kotlin code to using Alibaba Cloud SMS.

**Make sure you have your own:**
1. Region ID
2. Access Key
3. Secret Key

**How to use:**
1. Add dependency 
```
<dependency>
   <groupId>com.aliyun</groupId>
   <artifactId>aliyun-java-sdk-core</artifactId>
   <version>4.6.0</version>
</dependency> 
   ```
   
2. Pull
3. Fill the missing variables
4. Run

Example Response:
```json
{
	"ResponseCode": "OK",
	"NumberDetail": {
		"Region": "Indonesia",
		"Country": "Indonesia",
		"Carrier": "IM3"
	},
	"RequestId": "XXXXXX-XXXX-XXXX-XXXXX-XXXXXXXX",
	"Segments": "1",
	"ResponseDescription": "1234567890",
	"From": "INVESTREE",
	"To": "62857123456789",
	"MessageId": "1234567890"
}
```