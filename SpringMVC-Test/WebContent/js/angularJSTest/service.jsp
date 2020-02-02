<%@ include file="/WEB-INF/views/defs/taglibs.jsp"%>  

<script type="text/javascript">
//<![CDATA[

app.service('userService', function($http) {
    this.findAll = function(callback) {
        $http.get('${ctx}/userList').then(callback);
    }
    this.findUserById = function (userId, callback) {
        $http.get('${ctx}/userList/' + userId).then(callback);
    };
});



//]]>
</script>