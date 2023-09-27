import requests

url = "https://meteostat.p.rapidapi.com/stations/hourly"

querystring = {"station":"10637","start":"2020-01-01","end":"2020-01-01","tz":"Europe/Berlin"}

headers = {
	"X-RapidAPI-Key": "975bde95eemsh18aba26f46a7f45p1d4fbcjsn093b47f3609e",
	"X-RapidAPI-Host": "meteostat.p.rapidapi.com"
}

response = requests.request("GET", url, headers=headers, params=querystring)

print(response.text) 