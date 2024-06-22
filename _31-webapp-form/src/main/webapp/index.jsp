<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="java.util.Map"%>
<%
  Map<String, String> errors = (Map<String, String>)request.getAttribute("errors");
    %>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Users form</title>
    <link href="<%=request.getContextPath()%>/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-QWTKZyjpPEjISv5WaRU9OFeRpok6YctnYmDr5pNlyT2bRjXh0JMhjY6hW+ALEwIH" crossorigin="anonymous">

</head>

<body>

<h3>Users form</h3>

<%
if(errors != null && errors.size()>0) {
%>

<ul class="alert alert-danger mx-5 px-5">
<% for(String error: errors.values()){%>

<li> <% out.print(error); %> </li>

<%}%>
</ul>

<%}%>

<div class="px-5">
<form action="/webapp-form/registry" method="post">

    <div class="row mb-3">
        <label for="username" class="col-form-label col-sm-2">Usuario</label>
        <div class="col-sm-4">
            <input type="text" name="username" id="username" class="form-control" value="${param.username}" >
        </div>
        <%
        if (errors != null && errors.containsKey("username")){
            out.println("<small class='alert alert-danger col-sm-4' style='color: red;'>" + errors.get("username") + "</small>");
            }
        %>
    </div>

    <div class="row mb-3">
        <label for="password" class="col-form-label col-sm-2">Password</label>
        <div class="col-sm-4"><input type="password" name="password" id="password" class="form-control"></div>
        <%
            if (errors != null && errors.containsKey("password")){
                out.println("<small class='alert alert-danger col-sm-4' style='color: red;'>" + errors.get("password") + "</small>");
                }
            %>
    </div>

    <div class="row mb-3">
        <label for="email" class="col-form-label col-sm-2">Email</label>
        <div class="col-sm-4">
            <input type="text" name="email" id="email" class="form-control" value="${param.email}">
        </div>
        <%
            if (errors != null && errors.containsKey("email")){
                out.println("<small class='alert alert-danger col-sm-4' style='color: red;'>" + errors.get("email") + "</small>");
                }
            %>
    </div>
    <div class="row mb-3">
        <label for="country" class="col-form-label col-sm-2">Country</label>
        <div class="col-sm-4">
            <select name="country" id="country" class="form-select">
                <option value="">-- select --</option>
                <option value="ES" ${param.country.equals("ES") ? "selected" : ""}>Spain</option>
                <option value="MX" ${param.country.equals("MX") ? "selected" : ""}>México</option>
                <option value="CL" ${param.country.equals("CL") ? "selected" : ""}>Chile</option>
                <option value="AR" ${param.country.equals("AR") ? "selected" : ""}>Argentina</option>
                <option value="PE" ${param.country.equals("PE") ? "selected" : ""}>Perú</option>
                <option value="CO" ${param.country.equals("CO") ? "selected" : ""}>Colombia</option>
                <option value="UY" ${param.country.equals("UY") ? "selected" : ""}>Uruguay</option>
                <option value="VE" ${param.country.equals("VE") ? "selected" : ""}>Venezuela</option>
            </select>
        </div>
        <%
            if (errors != null && errors.containsKey("country")){
                out.println("<small class='alert alert-danger col-sm-4' style='color: red;'>" + errors.get("country") + "</small>");
                }
            %>
    </div>

    <div class="row mb-3">
        <label for="programmingLanguages" class="col-form-label col-sm-2">Programming languages / Frameworks </label>
        <div class="col-sm-4">
            <select name="programmingLanguages" id="programmingLanguages" multiple class="form-select">
                <option value="java" ${paramValues.programmingLanguages.stream().anyMatch(v -> v.equals("java")).get()?"selected": ""}>Java SE</option>
                <option value="jakartaee" ${paramValues.programmingLanguages.stream().anyMatch(v -> v.equals("jakartaee")).get()?"selected": ""}>Jakarta EE</option>
                <option value="spring" ${paramValues.programmingLanguages.stream().anyMatch(v -> v.equals("spring")).get()?"selected": ""}>Spring Boot</option>
                <option value="js" ${paramValues.programmingLanguages.stream().anyMatch(v -> v.equals("js")).get()?"selected": ""}>JavaScript</option>
                <option value="angular" ${paramValues.programmingLanguages.stream().anyMatch(v -> v.equals("angular")).get()?"selected": ""}>Angular</option>
                <option value="react" ${paramValues.programmingLanguages.stream().anyMatch(v -> v.equals("react")).get()?"selected": ""}>React</option>
            </select>
        </div>
        <%
            if (errors != null && errors.containsKey("programmingLanguages")){
                out.println("<small class='alert alert-danger col-sm-4' style='color: red;'>" + errors.get("programmingLanguages") + "</small>");
                }
            %>
    </div>

    <div class="row mb-3">
        <label class="col-form-label col-sm-2">Roles</label>
        <div class="form-check col-sm-2">
            <input type="checkbox" name="role" value="ADMIN_ROLE"
             ${paramValues.role.stream().anyMatch(v -> v.equals("ADMIN_ROLE")).get()?"selected": ""}
             class="form-check-input">
            <label class="form-check-label">Administrator</label>
        </div>
        <div class="form-check col-sm-2">
            <input type="checkbox" name="role" value="USER_ROLE" class="form-check-input"
            ${paramValues.role.stream().anyMatch(v -> v.equals("USER_ROLE")).get()?"selected": ""}>
            <label class="form-check-label">User</label>
        </div>
        <div class="form-check col-sm-2">
            <input type="checkbox" name="role" value="MODERATOR_ROLE" class="form-check-input"
            ${paramValues.role.stream().anyMatch(v -> v.equals("MODERATOR_ROLE")).get()?"selected": ""}>
            <label class="form-check-label">Moderator</label>
        </div>
        <%
            if (errors != null && errors.containsKey("role")){
                out.println("<small class='alert alert-danger col-sm-4' style='color: red;'>" + errors.get("role") + "</small>");
                }
            %>
    </div>
    <div class="row mb-3">
        <label class="col-form-label col-sm-2">Languages</label>
        <div class="form-check col-sm-2">
            <input type="radio" name="language" value="es" class="form-check-input" ${param.language.equals("es") ? "checked" : ""}>
            <label class="form-check-label">Spanish</label>
        </div>
        <div class="form-check col-sm-2">
            <input type="radio" name="language" value="en" class="form-check-input" ${param.language.equals("en") ? "checked" : ""}>
            <label class="form-check-label">English</label>
        </div>
        <div class="form-check col-sm-2">
            <input type="radio" name="language" value="fr" class="form-check-input" ${param.language.equals("fr") ? "checked" : ""}>
            <label class="form-check-label">French</label>
        </div>
        <%
            if (errors != null && errors.containsKey("language")){
                out.println("<small class='alert alert-danger col-sm-4' style='color: red;'>" + errors.get("language") + "</small>");
                }
            %>
    </div>
    <div class="row mb-3">
        <label class="col-form-label col-sm-2">Enable</label>
        <div class="form-check col-sm-2">
            <input type="checkbox" name="enable" id="enable" checked class="form-check-input">
        </div>
    </div>

    <div>
        <div class="row mb-3">
            <input type="submit" value="Send" class="btn btn-primary">
        </div>
    </div>
    <input type="hidden" name="secret" value="12345">
</form>
</div>
</body>
</html>