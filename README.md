# REST-API-CLIENT-2

*COMPANY* : CODE TECH IT SOLUTIONS

*NAME* : SUSARLA PADMAKSHI

*INTERN ID* : CT04DN839

*DOMAIN* : JAVA PROGRAMMING

*DURATION* : 4 WEEKS

*MENTROR* : NEELA SANTOSH

*DESCRIPTION* : 
This project is a command-line utility built using Java to fetch real-time weather data for a user-specified city. It makes use of the public REST API provided by wttr.in and integrates external JSON parsing capabilities through the use of the org.json library. Developed and executed in Visual Studio Code, this application serves as a hands-on demonstration of how Java can be used to consume web APIs, parse JSON responses, and format the data into a readable report.
The project’s core logic is implemented in the source file ex2.java. It prompts the user to enter the name of a city and dynamically constructs a URL query to fetch the weather details in JSON format. The program then parses the API response using the json-20210307.jar library, extracts relevant fields such as temperature, humidity, weather conditions, and wind speed, and formats the output into a structured weather report. This report is both printed to the terminal and saved to a text file (weather.txt), creating a persistent log of the request.

Key Components:
ex2.java: This Java source file contains the complete logic for user input, API communication, JSON parsing, and output formatting. It utilizes classes like HttpURLConnection, BufferedReader, and FileWriter from the java.net and java.io packages, along with org.json.JSONObject for JSON handling.
json-20210307.jar: This is an external JSON library used to simplify the parsing and traversal of JSON responses received from the API. It enables the application to extract nested data such as current weather descriptions and temperature readings.
weather.txt: A simple output text file where the weather report is stored. This provides a convenient way to retain results for future reference.
API Used: The application integrates with the wttr.in public weather API using a formatted request like:
perl
Copy code
https://wttr.in/<city>?format=j1
This returns the weather data in a compact JSON format.

Functionality Overview:
User Prompt: Prompts the user to enter a city name.
API Request: Constructs a GET request to the wttr.in API.
JSON Parsing: Parses the returned JSON to extract:
Current temperature (temp_C)
Feels-like temperature (FeelsLikeC)
Weather condition (weatherDesc)
Humidity and wind speed
Output Formatting: Nicely formats this data into a readable structure.

File Writing: Saves the output to weather.txt using FileWriter.

Environment & Execution:
Language: Java (Tested with JDK 21)
IDE: Visual Studio Code
Libraries: json-20210307.jar
Execution Commands:

Compile:
bash
javac -cp .;json-20210307.jar ex2.java

Run:
bash
java -cp .;json-20210307.jar ex2

Benefits & Learning Outcomes:
This project not only strengthens understanding of Java fundamentals like input/output and exception handling but also introduces concepts such as working with HTTP connections, handling third-party libraries, and parsing JSON in Java. It simulates real-world application development where programs must interact with external APIs and dynamically process the results. Furthermore, by logging the output to a file, it models how data persistence can be added to Java applications.
The Weather App is ideal for students and developers seeking practical exposure to integrating Java with real-time data services. It reinforces concepts in network programming, modular code organization, and clean user interaction, making it a valuable foundational project for Java-based software development.

#OUTPUT :

![Image](https://github.com/user-attachments/assets/f941606b-c605-4639-9f5f-d834f0ad0054)
