<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ include file="/WEB-INF/views/defs/taglibs.jsp"%>  

<style>
	body {background-color: powderblue;}
	h1   {color: blue;}
	p    {color: red;}
</style>

<h1 style="color:red !important;">htmlCssTest.jsp</h1> 	
<h1>-------------------------------------------------------------------------------------</h1>

<div class="" id="search">
	<ul>
		<li class="">Elemento li de la lista</li>	
		<li class="">	        	     	        	               	        	       
        	
        	<div class="">
               <label class=""><strong>Send voucher to the excursion provider</strong></label>
               <br> 
               <div>
                   <label class="label">E-mail Contact</label>
                   <input type="text" value="" disabled="disabled" class="text" name="emailsToJOLSendVoucher" id="emailsToJOLSendVoucher" aria-required="true">
                   <input type="radio" value="true" checked="checked" class="radio" name="sendingVoucherFromJOL" id="sendingVoucherFromJOL1">
                   <label class="label"><strong>Yes</strong></label>
                   <input type="radio" checked="checked" value="false" class="radio" name="sendingVoucherFromJOL" id="sendingVoucherFromJOL2">
                   <label class="label"><strong>No</strong></label>
               </div>	               
            </div>	                        	                                            
        </li>	
		<li class="">Elemento li de la lista</li>
	</ul>	  
</div>



<h1>-------------------------------------------------------------------------------------</h1>