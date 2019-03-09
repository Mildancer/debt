<%@ page pageEncoding="UTF-8" contentType="text/html; charset=UTF-8" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Dodawanie użytkownika</title>
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css"
          integrity="sha384-BVYiiSIFeK1dGmJRAkycuHAHRg32OmUcww7on3RYdg4Va+PmSTsz/K68vbdEjh4u" crossorigin="anonymous">

    <script
            src="https://code.jquery.com/jquery-2.2.4.min.js"
            integrity="sha256-BbhdlvQf/xTY9gja0Dq3HiwQF8LaCRTXxZKRutelT44="
            crossorigin="anonymous"></script>

    <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"
            integrity="sha384-Tc5IQib027qvyjSMfHjOMaLkfuWVxZxUPnCJA7l2mCWNIpG9mGCD8wGNIcPD7Txa"
            crossorigin="anonymous"></script>
</head>
<body>
<%@ include file="/WEB-INF/navbar.jsp" %>
<div class="container">

    <form method="post"
    action="<c:url value="/debts/create"/>"
    class="form-horizontal">
    <div class="form-group">
        <label for="debtorId" class="col-sm-2 control-label">Debtor: </label>
        <div class="col-sm-9">
            <select id="debtorId" name="debtorId"
                    class="form-control">
                <option value="">-- select debtor --</option>
                <c:forEach var="debtor" items="${debtors}">
                    <option value="${debtor.id}">${debtor.firstName} ${debtor.lastName}</option>
                </c:forEach>
            </select>
        </div>
        <div class="col-sm-1">
            <button type="button" class="btn btn-default">
                <span class="glyphicon glyphicon-plus"></span>
            </button>
        </div>
    </div>
                    <div class="form-group">
                        <label for="amount" class="col-sm-2 control-label">kwota zadlużenia: </label>
                        <div class="col-sm-10">
                            <input id="amount"
                                   type="amount"
                                   name="amount"
                                   class="form-control"
                                   value="${debt.amount}"
                                   placeholder="prowadz kwote">
                        </div>
                </div>

                <div class="form-group">
                    <div class="col-sm-offset-2 col-sm-10">
                        <button type="submit" class="btn btn-primary">Zapisz</button>
                    </div>
                </div>
            </form>
        </div>
    </div>

</div>

</body>
</html>