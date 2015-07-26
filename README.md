# LocationService
Supported endpoints:
<br/>
1. /locations?s=<sid>
<br/>
 Store locations for a subject. Post body has one location
<br/>
 POST request example:
<br/>
 url:
<br/>
          http://localhost:8080/locations?s=125
<br/>
 body:
<br/>
          { "location":{"latitude":20, "longitude":30}, "timestamp": 123456}
<br/>
2. /locations/all
<br/>
Returns all stored locations
<br/>
GET request example:
<br/>
url:
<br/>
          http://localhost:8080/locations/all
<br/>
3. /locations?lat=<lat>&long=<long>&d=<distance>&t1=<timeMillisUtc>&t2=<timeMillisUtc>&s=<sid1>,<sid2>
<br/>
Returns locations within proximity of a location. t1, t2 and s parametrs are optional and not yet implemented
<br/>
GET request example:
<br/>
url:
<br/>
          http://localhost:8080/locations?lat=10&long=20&d=10
