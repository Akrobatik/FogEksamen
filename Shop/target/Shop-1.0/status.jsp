<%@page import="entity.Customer"%>

<%
    Object o = session.getAttribute("customer");
    Customer customer;

    if (o != null)
    {
        customer = (Customer) o;
%>

<p>Logged in as: <span id="CustomerName"><%= customer.getName()%></span></p>
<p>Account: <span id="CustomerBalance"><%= customer.getBalance()%></span></p>

<form action="Controller" method="post">

    <input type="hidden" name="origin" value="logout">

    <input type="submit" name="Logout" value="Log out">

</form>

<%
    }
    else
    {
%>

    <p>Not logged in...</p>

<%
    }
%>
