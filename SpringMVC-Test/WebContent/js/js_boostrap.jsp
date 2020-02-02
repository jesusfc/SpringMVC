<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ include file="/WEB-INF/views/defs/taglibs.jsp"%>

<script type="text/javascript">
//<![CDATA[


	/**
	* DOCUMENT READY 
	*/
	$(document).ready(function(){
		
		$('#exampleModal').on('show.bs.modal', function (e) {
			
			var idZone = e.relatedTarget.value;
			console.log("value: " + idZone);
			if (idZone == '') {
				loadNewZone();				
			} else {
				loadEditZone(idZone);
			}
			
			console.log("ENTRO");
			sleep(5000);
			 if (1==2) {
			   return e.preventDefault() // stops modal from being shown
			 }
			
		})
		
	});	
	
	function loadNewZoneSinModal() {
		console.log("loadNewZoneSinModal");
		$('#exampleModal2').modal('show');
	}

	function loadNewZone() {
		console.log("loadNewZone");		
	}
	
	function loadEditZone(idZone) {
		console.log("loadEditZone: " + idZone);		
	}

	function sleep(milliseconds) {
		 var start = new Date().getTime();
		 for (var i = 0; i < 1e7; i++) {
		  if ((new Date().getTime() - start) > milliseconds) {
		   break;
		  }
		 }
		}

//]]>
</script>

