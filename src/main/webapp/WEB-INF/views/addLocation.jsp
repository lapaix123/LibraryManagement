<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Add Location</title>
</head>
<body>
<h2>Add Location</h2>
<form action="addLocation" method="post">
    <label for="locationCode">Location Code:</label>
    <input type="text" id="locationCode" name="locationCode" required><br>

    <label for="locationName">Location Name:</label>
    <input type="text" id="locationName" name="locationName" required><br>

    <label for="locationType">Location Type:</label>
    <select id="locationType" name="locationType" required>
        <option value="PROVINCE">Province</option>
        <option value="DISTRICT">District</option>
        <option value="SECTOR">Sector</option>
        <option value="CELL">Cell</option>
        <option value="VILLAGE">Village</option>
    </select><br>

    <label for="parentId">Parent Location (Optional):</label>
    <input type="text" id="parentId" name="parentId"><br>

    <button type="submit">Add Location</button>
</form>
</body>
</html>
