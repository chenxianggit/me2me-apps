﻿<%@ page contentType="text/html;charset=UTF-8" language="java"%>
<!DOCTYPE html>
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<%@include file="../common/meta.jsp"%>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<meta charset="utf-8" />

<title>ZX_IMS 2.0 - 用户头像框列表</title>

<link href="${ctx}/css/bootstrap.min.css" rel="stylesheet" />
<link href="${ctx}/css/bootstrap-reset.css" rel="stylesheet" />
<link href="${ctx}/assets/font-awesome/css/font-awesome.css" rel="stylesheet" />
<link href="${ctx}/assets/advanced-datatable/media/css/demo_page.css" rel="stylesheet" />
<link href="${ctx}/assets/advanced-datatable/media/css/demo_table.css" rel="stylesheet" />
<link rel="stylesheet" href="${ctx}/assets/data-tables/DT_bootstrap.css" />
<link href="${ctx}/css/slidebars.css" rel="stylesheet" />
<link href="${ctx}/css/style.css" rel="stylesheet" />
<link href="${ctx}/css/style-responsive.css" rel="stylesheet" />
<link rel="stylesheet" type="text/css" href="${ctx}/assets/bootstrap-datetimepicker/css/datetimepicker.css" />

<script src="${ctx}/js/jquery.js"></script>
<script src="${ctx}/js/jquery-ui-1.9.2.custom.min.js"></script>
<script src="${ctx}/js/jquery-migrate-1.2.1.min.js"></script>
<script src="${ctx}/js/bootstrap.min.js"></script>
<script type="text/javascript">

</script>
</head>
<body>
	<section id="container" class="">
		<!--header start-->
		<%@include file="../common/header.jsp"%>
		<!--header end-->

		<!--sidebar start-->
		<jsp:include page="../common/leftmenu.jsp" flush="false">
			<jsp:param name="t" value="12" />
			<jsp:param name="s" value="12_9" />
		</jsp:include>
		<!--sidebar end-->

		<!--main content start-->
		<section id="main-content">
			<section class="wrapper">
				<form id="form1" action="${ctx}/appuser/avatarFrame/list" method="post">
					<div class="row">
						<div class="col-lg-12">
							<section class="panel">
								<header class="panel-heading">执行操作</header>
								<div class="panel-body">
									<div class="form-inline" role="form">
										名称
										<input type="text" id="name" name="name" value="${dataObj.name }" class="form-control">&nbsp;&nbsp;
										<input type="submit" id="btnSearch" name="btnSearch" value="搜索" class="btn btn-info" />
									</div>
								</div>
							</section>
						</div>
					</div>
				</form>
				<!-- page start-->
				<div class="row">
					<div class="col-sm-12">
						<section class="panel">
							<header class="panel-heading">
								| 头像框列表 &emsp;
									<button type="button" class="btn btn-primary" data-toggle="modal" data-target="#myModal">
									  新 增
									</button>
								<span class="tools pull-right">
									<a href="javascript:;" class="fa fa-chevron-down"></a>
								</span>
							</header>
							<div class="panel-body">
								<div class="adv-table">
									<table class="display table table-bordered table-striped" id="dynamic-table">
										<thead>
											<tr>
												<th>名称</th>
												<th>头像框</th>
												<th>操作</th>
											</tr>
										</thead>
										<tbody>
											<c:forEach items="${dataObj.results}" var="userItem">
												<tr class="gradeX">
													<th>${userItem.name }</th>
													<th><img src="${userItem.avatarFrame }" height="50"/></th>
													<th>
														<a href="${ctx}/appuser/avatarFrame/del/${userItem.id }" onclick="return deleteAvatarFrame();">删除</a>
													</th>
												</tr>
											</c:forEach>
										</tbody>
										<tfoot>
											<tr>
												<th>名称</th>
												<th>头像框</th>
												<th>操作</th>
											</tr>
										</tfoot>
									</table>
								</div>
							</div>
						</section>
					</div>
				</div>
				<!-- page end-->
			</section>
		</section>
		<!--main content end-->

		<!-- Right Slidebar start -->
		<%@include file="../common/rightSlidebar.jsp"%>
		<!-- Right Slidebar end -->

		<!--footer start-->
		<%@include file="../common/footer.jsp"%>
		<!--footer end-->
	</section>
	
	<!-- js placed at the end of the document so the pages load faster -->
	<script class="include" type="text/javascript" src="${ctx}/js/jquery.dcjqaccordion.2.7.js"></script>
	<script src="${ctx}/js/jquery.scrollTo.min.js"></script>
	<script src="${ctx}/js/jquery.nicescroll.js" type="text/javascript"></script>
	<script type="text/javascript" src="${ctx}/assets/advanced-datatable/media/js/jquery.dataTables.js"></script>
	<script type="text/javascript" src="${ctx}/assets/data-tables/DT_bootstrap.js"></script>
	<script src="${ctx}/js/respond.min.js"></script>
	<script src="${ctx}/js/slidebars.min.js"></script>
	<script src="${ctx}/js/dynamic_table_init.js"></script>
	<script src="${ctx}/js/bootstrap-switch.js"></script>
	<script src="${ctx}/js/jquery.tagsinput.js"></script>
	<script src="${ctx}/js/form-component.js"></script>
	<script src="${ctx}/js/common-scripts.js"></script>
	<script src="${ctx}/js/advanced-form-components.js"></script>
	<script type="text/javascript" src="${ctx}/assets/bootstrap-datetimepicker/js/bootstrap-datetimepicker.js"></script>
	<script type="text/javascript">
var deleteAvatarFrame = function(){
	if(confirm('删除后将清除所有拥有本头像框的用户头像框，是否确定删除？')){
		return true;
	}
	return false;
}
	</script>
	
	<!-- Modal -->
	<div class="modal fade " id="myModal" tabindex="-1" role="dialog" aria-labelledby="myModalLabel">
		<form id="form2" action="${ctx}/appuser/avatarFrame/save" method="POST" enctype="multipart/form-data">
			<div class="modal-dialog modal-lg" role="document">
				<div class="modal-content">
					<div class="modal-header">
						<button type="button" class="close" data-dismiss="modal" aria-label="Close">
							<span aria-hidden="true">&times;</span>
						</button>
						<h4 class="modal-title" id="myModalLabel">新增</h4>
					</div>
					<div class="modal-body">
						<div class="form-group">
							<label for="exampleInputEmail1">名称</label>
	                        <input type="text" id="name" name="name" class="form-control" style="width: 100%">
						</div>
						<div class="form-group">
							<label for="exampleInputFile">头像框</label>
							<div class="fileupload fileupload-new" data-provides="fileupload">
								<div id="" class="fileupload-new thumbnail" style="width: 200px; height: 150px;">
								</div>
								<div class="fileupload-preview fileupload-exists thumbnail" style="max-width: 200px; max-height: 150px; line-height: 20px;"></div>
								<div>
									<span class="btn btn-white btn-file"> <span class="fileupload-new"><i class="fa fa-paper-clip"></i>选择上传图片</span>
										<span class="fileupload-exists"><i class="fa fa-undo"></i>修改</span>
										<input type="file" id="file" name="file" class="default">
									</span> 
									<a href="#" class="btn btn-danger fileupload-exists" data-dismiss="fileupload"><i class="fa fa-trash"></i>删除</a>
								</div>
							</div>
						</div>
					</div>
					<div class="modal-footer">
						<button class="btn" data-dismiss="modal" aria-hidden="true" onclick="modifyCommit()">更改</button>
						<button data-dismiss="modal" class="btn btn-default" type="button">关闭</button>
					</div>
				</div>
			</div>
		</form>
	</div>

</body>
</html>