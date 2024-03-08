<!DOCTYPE html>
<html>
<head>
    <title>Neil's Github</title>
</head>
<body>
<h1>Neil's HomePage</h1>
<ul>
    <#list menuItems as item>
         <li><a href="${item.url}">${item.label}</a></li>
    </#list>
</ul>
<footer>
    ${currentYear} Neil's Authority.
</footer>
</body>
</html>