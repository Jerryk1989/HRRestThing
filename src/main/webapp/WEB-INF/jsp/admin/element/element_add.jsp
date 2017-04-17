<%@ include file="../../includes/header.jsp" %>
<%@ include file="../../includes/Navbar.jsp" %>
<%@ include file="../../includes/SubNav_Admin.jsp" %>

<div class="wrapper">

    <%--SIDEBAR--%>
        <%@ include file="element_sidebar.jsp" %>

    <div id="main-wrapper" class="col-sm-10">
        <div class="col-sm-8">
            <form:form cssClass="form-horizontal" modelAttribute="elementVO" action="/admin/element/add" method="post">
                <fieldset>
                    <legend>Element Management</legend>
                    <div class="form-group">
                        <label for="inputNewElementType" class="col-lg-2 control-label">Element Type</label>
                        <div class="col-lg-10">
                            <form:input class="form-control" path="newElementType" type="text" id="inputNewElementType" placeholder="Element Type"></form:input>
                        </div>
                    </div>

                    <div class="form-group">
                        <label for="inputNewElements" class="col-lg-2 control-label">Element Type</label>
                        <div class="col-lg-10">
                            <form:textarea class="form-control" path="newElements" rows="3" id="inputNewElements" placeholder="Element Type"></form:textarea>
                            <span class="help-block">Enter eachnew Element on a new line.</span>
                        </div>
                    </div>

                    <div class="for-group">
                        <div class="col-lg-10 col-lg-offset-2">
                            <form:button class="btn btn-default">Cancel</form:button>
                            <form:button class="btn btn-default">Save</form:button>
                        </div>
                    </div>
                </fieldset>
            </form:form>
        </div>



            <%--ALERTS--%>

                <div class="col-sm-4">

                    <%--ALERTS--%>
                    <div class="${successAlert == null ? 'hidden' : successAlert}" id="successAlert">
                        <%--SUCCESS ALERT--%>
                        <div class="alert alert-dismissible alert-success">
                            <button type="button" class="close" data-dismiss="alert">&times;</button>
                            <strong>Well done!</strong> You successfully read <a href="#" class="alert-link">this important alert message</a>.
                        </div>
                    </div>
                    <div class="${warningAlert == null ? 'hidden' : successAlert}" id="warningAlert">
                        <%--ALERT WARNING--%>
                        <div class="alert alert-dismissible alert-warning">
                            <button type="button" class="close" data-dismiss="alert">&times;</button>
                            <h4>Warning!</h4>
                            <p>Best check yo self, you're not looking too good. Nulla vitae elit libero, a pharetra augue. Praesent commodo cursus magna, <a href="#" class="alert-link">vel scelerisque nisl consectetur et</a>.</p>
                        </div>
                    </div>

                    <div class="${errorAlert == null ? 'hidden' : successAlert}" id="errorAlert">
                        <%--ERROR WARNING--%>
                        <div class="alert alert-dismissible alert-danger">
                            <button type="button" class="close" data-dismiss="alert">&times;</button>
                            <strong>Oh snap!</strong> <a href="#" class="alert-link">Change a few things up</a> and try submitting again.
                        </div>
                    </div>
        </div>
    </div>
</div>

<%@ include file="../../includes/Footer.jsp" %>


