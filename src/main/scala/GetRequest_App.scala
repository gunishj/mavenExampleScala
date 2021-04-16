import scalaj.http.Http
object GetRequest_App {
  def send_request(storage_ip: String, api_path: String, user: String, password: String) = {
    val api_url = storage_ip + api_path
    print(api_url)
    val http_response = Http(api_url).auth(user, password).asString
    print(http_response.body)
  }
  def main(args: Array[String]): Unit = {
    println("Hello")
//   println(send_request("https://httpbin.org/", "digest-auth/auth/admin/admin123", "admin", "admin123"))
    println(Http("http://api.hostip.info/country.php").asString)
  }
}
