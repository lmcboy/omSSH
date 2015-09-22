<%@page import="java.util.ArrayList"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@page import="java.util.ArrayList"%>
<%@page import="java.util.List"%>
<%@taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>价格表查询</title>
<meta http-equiv="X-UA-Compatible" content="IE=edge" />
<meta name="apple-mobile-web-app-capable" content="yes" />
<link href="myCss/bootstrap.min.css" type="text/css" rel="stylesheet" />
<link href="myCss/myCss.css" type="text/css" rel="stylesheet" />
<link href="resources/css/jquery-ui-themes.css" type="text/css"
	rel="stylesheet" />
<link href="resources/css/axure_rp_page.css" type="text/css"
	rel="stylesheet" />
<link href="data/styles.css" type="text/css" rel="stylesheet" />
<link href="myCss1/styles.css" type="text/css" rel="stylesheet" />
z
<%--     <script src="resources/scripts/jquery-1.7.1.min.js"></script> --%>
<script src="myCss/jquery-2.1.4.min.js"></script>
<script src="myCss/bootstrap.min.js"></script>
<script src="resources/scripts/jquery-ui-1.8.10.custom.min.js"></script>
<script src="resources/scripts/axure/axQuery.js"></script>
<script src="resources/scripts/axure/globals.js"></script>
<script src="resources/scripts/axutils.js"></script>
<script src="resources/scripts/axure/annotation.js"></script>
<script src="resources/scripts/axure/axQuery.std.js"></script>
<script src="resources/scripts/axure/doc.js"></script>
<script src="data/document.js"></script>
<script src="resources/scripts/messagecenter.js"></script>
<script src="resources/scripts/axure/events.js"></script>
<script src="resources/scripts/axure/action.js"></script>
<script src="resources/scripts/axure/expr.js"></script>
<script src="resources/scripts/axure/geometry.js"></script>
<script src="resources/scripts/axure/flyout.js"></script>
<script src="resources/scripts/axure/ie.js"></script>
<script src="resources/scripts/axure/model.js"></script>
<script src="resources/scripts/axure/repeater.js"></script>
<script src="resources/scripts/axure/sto.js"></script>
<script src="resources/scripts/axure/utils.temp.js"></script>
<script src="resources/scripts/axure/variables.js"></script>
<script src="resources/scripts/axure/drag.js"></script>
<script src="resources/scripts/axure/move.js"></script>
<script src="resources/scripts/axure/visibility.js"></script>
<script src="resources/scripts/axure/style.js"></script>
<script src="resources/scripts/axure/adaptive.js"></script>
<script src="resources/scripts/axure/tree.js"></script>
<script src="resources/scripts/axure/init.temp.js"></script>
<script src="myCss1/data.js"></script>
<script src="resources/scripts/axure/legacy.js"></script>
<script src="resources/scripts/axure/viewer.js"></script>
<script type="text/javascript">
	$axure.utils.getTransparentGifPath = function() {
		return 'resources/images/transparent.gif';
	};
	$axure.utils.getOtherPath = function() {
		return 'resources/Other.html';
	};
	$axure.utils.getReloadPath = function() {
		return 'resources/reload.html';
	};
</script>
</head>
<body>
  <%
  	String[] head = (String[]) session.getAttribute("head");
  	List data = new ArrayList();
  	data = (List) session.getAttribute("data");
  	String[] addhead = (String[]) session.getAttribute("addhead");
  %>
	<div id="base" class="">

		<!-- Unnamed (Shape) -->
		<div id="u0" class="ax_h1">
			<img id="u0_img" class="img " src="resources/images/transparent.gif" />
			<!-- Unnamed () -->
			<div id="u1" class="text">
				<p>
					<span>销售订单管理系统</span>
				</p>
			</div>
		</div>

		<!-- Unnamed (Image) -->
		<div id="u2" class="ax_image">
			<img id="u2_img" class="img " src="images/login/u2.png" />
			<!-- Unnamed () -->
			<div id="u3" class="text">
				<p>
					<span></span>
				</p>
			</div>
		</div>

		<!-- Unnamed (Horizontal Line) -->
		<div id="u4" class="ax_horizontal_line">
			<img id="u4_start" class="img "
				src="resources/images/transparent.gif" alt="u4_start" /> <img
				id="u4_end" class="img " src="resources/images/transparent.gif"
				alt="u4_end" /> <img id="u4_line" class="img "
				src="images/login/u4_line.png" alt="u4_line" />
		</div>

		<!-- Unnamed (Tree) -->
		<div id="u5" class="ax_tree_node treeroot">
			<div id="u5_children" class="u5_children">

				<!-- Unnamed (Tree Node) -->
				<div id="u6" class="ax_tree_node treenode">
					<!-- Unnamed (Shape) -->
					<div id="u7" class="" selectiongroup="u5_tree_group">
						<img id="u7_img" class="img "
							src="resources/images/transparent.gif" />
						<!-- Unnamed () -->
						<div id="u8" class="text">
							<p>
								<span>首页</span>
							</p>
						</div>
					</div>
				</div>

				<!-- Unnamed (Tree Node) -->
				<div id="u9" class="ax_tree_node treenode">

					<!-- Unnamed (Image) -->
					<div id="u10" class="ax_image">
						<img id="u10_img" class="img " src="images/login/u10.png" />
						<!-- Unnamed () -->
						<div id="u11" class="text">
							<p>
								<span></span>
							</p>
						</div>
					</div>
					<!-- Unnamed (Shape) -->
					<div id="u12" class="" selectiongroup="u5_tree_group">
						<img id="u12_img" class="img "
							src="resources/images/transparent.gif" />
						<!-- Unnamed () -->
						<div id="u13" class="text">
							<p>
								<span>销售订单管理</span>
							</p>
						</div>
					</div>
					<div id="u9_children" class="u9_children"
						style="visibility: hidden;">

						<!-- Unnamed (Tree Node) -->
						<div id="u14" class="ax_tree_node treenode">
							<!-- Unnamed (Shape) -->
							<div id="u15" class="" selectiongroup="u5_tree_group">
								<img id="u15_img" class="img "
									src="resources/images/transparent.gif" />
								<!-- Unnamed () -->
								<div id="u16" class="text">
									<p>
										<span>Item 1.1</span>
									</p>
								</div>
							</div>
						</div>

						<!-- Unnamed (Tree Node) -->
						<div id="u17" class="ax_tree_node treenode">
							<!-- Unnamed (Shape) -->
							<div id="u18" class="" selectiongroup="u5_tree_group">
								<img id="u18_img" class="img "
									src="resources/images/transparent.gif" />
								<!-- Unnamed () -->
								<div id="u19" class="text">
									<p>
										<span>Item 1.2</span>
									</p>
								</div>
							</div>
						</div>

						<!-- Unnamed (Tree Node) -->
						<div id="u20" class="ax_tree_node treenode">
							<!-- Unnamed (Shape) -->
							<div id="u21" class="" selectiongroup="u5_tree_group">
								<img id="u21_img" class="img "
									src="resources/images/transparent.gif" />
								<!-- Unnamed () -->
								<div id="u22" class="text">
									<p>
										<span>Item 1.3</span>
									</p>
								</div>
							</div>
						</div>
					</div>
				</div>

				<!-- Unnamed (Tree Node) -->
				<div id="u23" class="ax_tree_node treenode">

					<!-- Unnamed (Image) -->
					<div id="u24" class="ax_image">
						<img id="u24_img" class="img " src="images/login/u10.png" />
						<!-- Unnamed () -->
						<div id="u25" class="text">
							<p>
								<span></span>
							</p>
						</div>
					</div>
					<!-- Unnamed (Shape) -->
					<div id="u26" class="" selectiongroup="u5_tree_group">
						<img id="u26_img" class="img "
							src="resources/images/transparent.gif" />
						<!-- Unnamed () -->
						<div id="u27" class="text">
							<p>
								<span>发货单管理</span>
							</p>
						</div>
					</div>
					<div id="u23_children" class="u23_children"
						style="visibility: hidden;">

						<!-- Unnamed (Tree Node) -->
						<div id="u28" class="ax_tree_node treenode">
							<!-- Unnamed (Shape) -->
							<div id="u29" class="" selectiongroup="u5_tree_group">
								<img id="u29_img" class="img "
									src="resources/images/transparent.gif" />
								<!-- Unnamed () -->
								<div id="u30" class="text">
									<p>
										<span>输入文本...</span>
									</p>
								</div>
							</div>
						</div>

						<!-- Unnamed (Tree Node) -->
						<div id="u31" class="ax_tree_node treenode">
							<!-- Unnamed (Shape) -->
							<div id="u32" class="" selectiongroup="u5_tree_group">
								<img id="u32_img" class="img "
									src="resources/images/transparent.gif" />
								<!-- Unnamed () -->
								<div id="u33" class="text">
									<p>
										<span>输入文本...</span>
									</p>
								</div>
							</div>
						</div>
					</div>
				</div>

				<!-- Unnamed (Tree Node) -->
				<div id="u34" class="ax_tree_node treenode">

					<!-- Unnamed (Image) -->
					<div id="u35" class="ax_image">
						<img id="u35_img" class="img " src="images/login/u10.png" />
						<!-- Unnamed () -->
						<div id="u36" class="text">
							<p>
								<span></span>
							</p>
						</div>
					</div>
					<!-- Unnamed (Shape) -->
					<div id="u37" class="" selectiongroup="u5_tree_group">
						<img id="u37_img" class="img "
							src="resources/images/transparent.gif" />
						<!-- Unnamed () -->
						<div id="u38" class="text">
							<p>
								<span>制单界面</span>
							</p>
						</div>
					</div>
					<div id="u34_children" class="u34_children"
						style="visibility: hidden;">

						<!-- Unnamed (Tree Node) -->
						<div id="u39" class="ax_tree_node treenode">
							<!-- Unnamed (Shape) -->
							<div id="u40" class="" selectiongroup="u5_tree_group">
								<img id="u40_img" class="img "
									src="resources/images/transparent.gif" />
								<!-- Unnamed () -->
								<div id="u41" class="text">
									<p>
										<span>输入文本...</span>
									</p>
								</div>
							</div>
						</div>
					</div>
				</div>

				<!-- Unnamed (Tree Node) -->
				<div id="u42" class="ax_tree_node treenode">

					<!-- Unnamed (Image) -->
					<div id="u43" class="ax_image">
						<img id="u43_img" class="img " src="images/login/u10.png" />
						<!-- Unnamed () -->
						<div id="u44" class="text">
							<p>
								<span></span>
							</p>
						</div>
					</div>
					<!-- Unnamed (Shape) -->
					<div id="u45" class="" selectiongroup="u5_tree_group">
						<img id="u45_img" class="img "
							src="resources/images/transparent.gif" />
						<!-- Unnamed () -->
						<div id="u46" class="text">
							<p>
								<span>orderbase维护</span>
							</p>
						</div>
					</div>
					<div id="u42_children" class="u42_children"
						style="visibility: hidden;">

						<!-- Unnamed (Tree Node) -->
						<div id="u47" class="ax_tree_node treenode">
							<!-- Unnamed (Shape) -->
							<div id="u48" class="" selectiongroup="u5_tree_group">
								<img id="u48_img" class="img " src="images/index/u48.png" />
								<!-- Unnamed () -->
								<div id="u49" class="text">
									<p>
										<span>orderbase</span><span>查询</span>
									</p>
								</div>
							</div>
						</div>

						<!-- Unnamed (Tree Node) -->
						<div id="u50" class="ax_tree_node treenode">
							<!-- Unnamed (Shape) -->
							<div id="u51" class="" selectiongroup="u5_tree_group">
								<img id="u51_img" class="img "
									src="resources/images/transparent.gif" />
								<!-- Unnamed () -->
								<div id="u52" class="text">
									<p>
										<span>orderbase</span><span>编辑</span>
									</p>
								</div>
							</div>
						</div>

						<!-- Unnamed (Tree Node) -->
						<div id="u53" class="ax_tree_node treenode">
							<!-- Unnamed (Shape) -->
							<div id="u54" class="" selectiongroup="u5_tree_group">
								<img id="u54_img" class="img "
									src="resources/images/transparent.gif" />
								<!-- Unnamed () -->
								<div id="u55" class="text">
									<p>
										<span>orderbase</span><span>导入</span>
									</p>
								</div>
							</div>
						</div>
					</div>
				</div>

				<!-- Unnamed (Tree Node) -->
				<div id="u56" class="ax_tree_node treenode">

					<!-- Unnamed (Image) -->
					<div id="u57" class="ax_image">
						<img id="u57_img" class="img " src="images/login/u10_selected.png" />
						<!-- Unnamed () -->
						<div id="u58" class="text">
							<p>
								<span></span>
							</p>
						</div>
					</div>
					<!-- Unnamed (Shape) -->
					<div id="u59" class="" selectiongroup="u5_tree_group">
						<img id="u59_img" class="img "
							src="resources/images/transparent.gif" />
						<!-- Unnamed () -->
						<div id="u60" class="text">
							<p>
								<span>主数据维护</span>
							</p>
						</div>
					</div>
					<div id="u56_children" class="u56_children">

						<!-- Unnamed (Tree Node) -->
						<div id="u61" class="ax_tree_node treenode">
							<!-- Unnamed (Shape) -->
							<div id="u62" class="" selectiongroup="u5_tree_group">
								<img id="u62_img" class="img "
									src="resources/images/transparent.gif" />
								<!-- Unnamed () -->
								<div id="u63" class="text">
									<p>
										<span>客户维护</span>
									</p>
								</div>
							</div>
						</div>

						<!-- Unnamed (Tree Node) -->
						<div id="u64" class="ax_tree_node treenode">
							<!-- Unnamed (Shape) -->
							<div id="u65" class="" selectiongroup="u5_tree_group">
								<img id="u65_img" class="img " src="images/findprice/u65.png" />
								<!-- Unnamed () -->
								<div id="u66" class="text">
									<p>
										<span>价格表管理</span>
									</p>
								</div>
							</div>
						</div>

						<!-- Unnamed (Tree Node) -->
						<div id="u67" class="ax_tree_node treenode">
							<!-- Unnamed (Shape) -->
							<div id="u68" class="" selectiongroup="u5_tree_group">
								<img id="u68_img" class="img "
									src="resources/images/transparent.gif" />
								<!-- Unnamed () -->
								<div id="u69" class="text">
									<p>
										<span>折扣管理</span>
									</p>
								</div>
							</div>
						</div>
					</div>
				</div>

				<!-- Unnamed (Tree Node) -->
				<div id="u70" class="ax_tree_node treenode">

					<!-- Unnamed (Image) -->
					<div id="u71" class="ax_image">
						<img id="u71_img" class="img " src="images/login/u10_selected.png" />
						<!-- Unnamed () -->
						<div id="u72" class="text">
							<p>
								<span></span>
							</p>
						</div>
					</div>
					<!-- Unnamed (Shape) -->
					<div id="u73" class="" selectiongroup="u5_tree_group">
						<img id="u73_img" class="img "
							src="resources/images/transparent.gif" />
						<!-- Unnamed () -->
						<div id="u74" class="text">
							<p>
								<span>系统设置</span>
							</p>
						</div>
					</div>
					<div id="u70_children" class="u70_children">

						<!-- Unnamed (Tree Node) -->
						<div id="u75" class="ax_tree_node treenode">
							<!-- Unnamed (Shape) -->
							<div id="u76" class="" selectiongroup="u5_tree_group">
								<img id="u76_img" class="img "
									src="resources/images/transparent.gif" />
								<!-- Unnamed () -->
								<div id="u77" class="text">
									<p>
										<span>orderbase</span><span>配置</span>
									</p>
								</div>
							</div>
						</div>

						<!-- Unnamed (Tree Node) -->
						<div id="u78" class="ax_tree_node treenode">
							<!-- Unnamed (Shape) -->
							<div id="u79" class="" selectiongroup="u5_tree_group">
								<img id="u79_img" class="img "
									src="resources/images/transparent.gif" />
								<!-- Unnamed () -->
								<div id="u80" class="text">
									<p>
										<span>客户订单配置</span>
									</p>
								</div>
							</div>
						</div>

						<!-- Unnamed (Tree Node) -->
						<div id="u81" class="ax_tree_node treenode">
							<!-- Unnamed (Shape) -->
							<div id="u82" class="" selectiongroup="u5_tree_group">
								<img id="u82_img" class="img "
									src="resources/images/transparent.gif" />
								<!-- Unnamed () -->
								<div id="u83" class="text">
									<p>
										<span>价格表配置</span>
									</p>
								</div>
							</div>
						</div>

						<!-- Unnamed (Tree Node) -->
						<div id="u84" class="ax_tree_node treenode">
							<!-- Unnamed (Shape) -->
							<div id="u85" class="" selectiongroup="u5_tree_group">
								<img id="u85_img" class="img "
									src="resources/images/transparent.gif" />
								<!-- Unnamed () -->
								<div id="u86" class="text">
									<p>
										<span>订单检查规则</span>
									</p>
								</div>
							</div>
						</div>
					</div>
				</div>

				<!-- Unnamed (Tree Node) -->
				<div id="u87" class="ax_tree_node treenode">

					<!-- Unnamed (Image) -->
					<div id="u88" class="ax_image">
						<img id="u88_img" class="img " src="images/login/u10.png" />
						<!-- Unnamed () -->
						<div id="u89" class="text">
							<p>
								<span></span>
							</p>
						</div>
					</div>
					<!-- Unnamed (Shape) -->
					<div id="u90" class="" selectiongroup="u5_tree_group">
						<img id="u90_img" class="img "
							src="resources/images/transparent.gif" />
						<!-- Unnamed () -->
						<div id="u91" class="text">
							<p>
								<span>用户管理</span>
							</p>
						</div>
					</div>
					<div id="u87_children" class="u87_children"
						style="visibility: hidden;">

						<!-- Unnamed (Tree Node) -->
						<div id="u92" class="ax_tree_node treenode">
							<!-- Unnamed (Shape) -->
							<div id="u93" class="" selectiongroup="u5_tree_group">
								<img id="u93_img" class="img "
									src="resources/images/transparent.gif" />
								<!-- Unnamed () -->
								<div id="u94" class="text">
									<p>
										<span>用户</span><span>管理</span>
									</p>
								</div>
							</div>
						</div>

						<!-- Unnamed (Tree Node) -->
						<div id="u95" class="ax_tree_node treenode">
							<!-- Unnamed (Shape) -->
							<div id="u96" class="" selectiongroup="u5_tree_group">
								<img id="u96_img" class="img "
									src="resources/images/transparent.gif" />
								<!-- Unnamed () -->
								<div id="u97" class="text">
									<p>
										<span>修改密码</span>
									</p>
								</div>
							</div>
						</div>
					</div>
				</div>

				<!-- Unnamed (Tree Node) -->
				<div id="u98" class="ax_tree_node treenode">

					<!-- Unnamed (Image) -->
					<div id="u99" class="ax_image">
						<img id="u99_img" class="img " src="images/login/u10.png" />
						<!-- Unnamed () -->
						<div id="u100" class="text">
							<p>
								<span></span>
							</p>
						</div>
					</div>
					<!-- Unnamed (Shape) -->
					<div id="u101" class="" selectiongroup="u5_tree_group">
						<img id="u101_img" class="img "
							src="resources/images/transparent.gif" />
						<!-- Unnamed () -->
						<div id="u102" class="text">
							<p>
								<span>权限管理</span>
							</p>
						</div>
					</div>
					<div id="u98_children" class="u98_children"
						style="visibility: hidden;">

						<!-- Unnamed (Tree Node) -->
						<div id="u103" class="ax_tree_node treenode">
							<!-- Unnamed (Shape) -->
							<div id="u104" class="" selectiongroup="u5_tree_group">
								<img id="u104_img" class="img "
									src="resources/images/transparent.gif" />
								<!-- Unnamed () -->
								<div id="u105" class="text">
									<p>
										<span>角色维护</span>
									</p>
								</div>
							</div>
						</div>

						<!-- Unnamed (Tree Node) -->
						<div id="u106" class="ax_tree_node treenode">
							<!-- Unnamed (Shape) -->
							<div id="u107" class="" selectiongroup="u5_tree_group">
								<img id="u107_img" class="img "
									src="resources/images/transparent.gif" />
								<!-- Unnamed () -->
								<div id="u108" class="text">
									<p>
										<span>权限分配</span>
									</p>
								</div>
							</div>
						</div>
					</div>
				</div>

				<!-- Unnamed (Tree Node) -->
				<div id="u109" class="ax_tree_node treenode">

					<!-- Unnamed (Image) -->
					<div id="u110" class="ax_image">
						<img id="u110_img" class="img " src="images/login/u10.png" />
						<!-- Unnamed () -->
						<div id="u111" class="text">
							<p>
								<span></span>
							</p>
						</div>
					</div>
					<!-- Unnamed (Shape) -->
					<div id="u112" class="" selectiongroup="u5_tree_group">
						<img id="u112_img" class="img "
							src="resources/images/transparent.gif" />
						<!-- Unnamed () -->
						<div id="u113" class="text">
							<p>
								<span>报表管理</span>
							</p>
						</div>
					</div>
					<div id="u109_children" class="u109_children"
						style="visibility: hidden;">

						<!-- Unnamed (Tree Node) -->
						<div id="u114" class="ax_tree_node treenode">
							<!-- Unnamed (Shape) -->
							<div id="u115" class="" selectiongroup="u5_tree_group">
								<img id="u115_img" class="img "
									src="resources/images/transparent.gif" />
								<!-- Unnamed () -->
								<div id="u116" class="text">
									<p>
										<span>报表查询</span>
									</p>
								</div>
							</div>
						</div>

						<!-- Unnamed (Tree Node) -->
						<div id="u117" class="ax_tree_node treenode">
							<!-- Unnamed (Shape) -->
							<div id="u118" class="" selectiongroup="u5_tree_group">
								<img id="u118_img" class="img "
									src="resources/images/transparent.gif" />
								<!-- Unnamed () -->
								<div id="u119" class="text">
									<p>
										<span>报表配置</span>
									</p>
								</div>
							</div>
						</div>
					</div>
				</div>
			</div>
		</div>

		<!-- Unnamed (Tree) -->
		<div id="u120" class="ax_tree_node treeroot">
			<div id="u120_children" class="u120_children">

				<!-- Unnamed (Tree Node) -->
				<div id="u121" class="ax_tree_node treenode">
					<!-- Unnamed (Shape) -->
					<div id="u122" class="" selectiongroup="u120_tree_group">
						<img id="u122_img" class="img "
							src="resources/images/transparent.gif" />
						<!-- Unnamed () -->
						<div id="u123" class="text">
							<p>
								<span></span>
							</p>
						</div>
					</div>
				</div>
			</div>
		</div>

		<!-- Unnamed (Tree) -->
		<div id="u124" class="ax_tree_node treeroot">
			<div id="u124_children" class="u124_children">

				<!-- Unnamed (Tree Node) -->
				<div id="u125" class="ax_tree_node treenode">
					<!-- Unnamed (Shape) -->
					<div id="u126" class="" selectiongroup="u124_tree_group">
						<img id="u126_img" class="img "
							src="resources/images/transparent.gif" />
						<!-- Unnamed () -->
						<div id="u127" class="text">
							<p>
								<span></span>
							</p>
						</div>
					</div>
				</div>
			</div>
		</div>

		<!-- Unnamed (Shape) -->
		<div id="u129" class="ax_h1">
			<img id="u129_img" class="img "
				src="resources/images/transparent.gif" />
			<!-- Unnamed () -->
			<div id="u130" class="text">
				<p>
					<span>主数据</span><span>维护&gt;</span><span>价格表管理</span>
				</p>
			</div>
		</div>

		<!-- Unnamed (Horizontal Line) -->
		<div id="u131" class="ax_horizontal_line">
			<img id="u131_start" class="img "
				src="resources/images/transparent.gif" alt="u131_start" /> <img
				id="u131_end" class="img " src="resources/images/transparent.gif"
				alt="u131_end" /> <img id="u131_line" class="img "
				src="images/login/u104_line.png" alt="u131_line" />
		</div>

		<form action="Price_getHead">
			<!-- Unnamed (Shape) -->
			<div id="u132" class="ax_paragraph">
				<img id="u132_img" class="img "
					src="resources/images/transparent.gif" />
				<!-- Unnamed () -->
				<div id="u133" class="text">
					<p>
						<span>客户</span><span>简称</span>
					</p>
				</div>
			</div>

			<!-- Unnamed (Text Field) -->
			<div id="u128" class="ax_text_field">
				<input id="u128_input" type="text" name="code" value="${code}" />
			</div>

			<!-- Unnamed (Shape) -->
			<div id="u134" class="ax_paragraph">
				<img id="u134_img" class="img "
					src="resources/images/transparent.gif" />
				<!-- Unnamed () -->
				<div id="u135" class="text">
					<p>
						<span>类型</span>
					</p>
				</div>
			</div>

			<!-- Unnamed (Text Field) -->
			<div id="u136" class="ax_text_field">
				<input id="u136_input" type="text" value="STD" />
			</div>

			<!-- Unnamed (Shape) -->
			<div id="u317" class="ax_paragraph">
				<img id="u317_img" class="img "
					src="resources/images/transparent.gif" />
				<!-- Unnamed () -->
				<div id="u318" class="text">
					<p>
						<span>工厂</span><span>型号</span>
					</p>
				</div>
			</div>

			<!-- Unnamed (Text Field) -->
			<div id="u319" class="ax_text_field">
				<input id="u319_input" type="text" value="" />
			</div>

			<!-- Unnamed (HTML Button) -->
			<div id="u323" class="ax_html_button">
				<input id="u323_input" type="submit" value="查询/编辑"/>
			</div>
		</form>


		<!-- Unnamed (HTML Button) -->
		<div id="u137" class="ax_html_button">

			<input id="u137_input" type="submit" value="新增" role="tab"
				aria-controls="addprice" data-toggle="tab" data-target="#addprice" />

		</div>



		<div class="tab-content">
			<!-- Unnamed (Table) -->
			<div id="showdata" role="tabpanel" class="ax_table tab-pane active">
				<div class="row">
					<table class="table table-bordered table-striped table-hover">
						<thead>
							<tr>
								<%
									if (head != null) {
										for (int i = 0; i < head.length; i++) {
								%>
								<th><%=head[i]%></th>
								<%
									}
									}
								%>
							</tr>
							<%
								if (head != null) {
									for (int j = 0; j < (data.size() / head.length); j++) {
							%>
							<tr>
								<%
									for (int k = 0; k < head.length; k++) {
								%>
								<th><%=data.get(j + k * (data.size() / head.length))%></th>
								<%
									}
								%>
							</tr>
							<%
								}
								}
							%>
						</thead>
					</table>
				</div>
			</div>

			<div id="addprice" role="tabpanel" class="tab-pane table-responsive">
				<form action="Price_addPrice" method="post"
					id="addform">
					<!-- <form action="test.action" method="post" id="addPriceForm"> -->
					<table id="addPriceTable"
						class="table table-hover table-bordered table-striped">
						<thead>
							<tr>
							  <%if(addhead!=null)for(int m=0;m<addhead.length;m++){ %>
							  <td><%=addhead[m] %></td>
							  <%} %>
							</tr>
						</thead>
						<tbody id="addBody">
							<tr>

								<td><input type="text" name="plYhItem" class="form-control"></td>
								<td><input type="text" name="effectiveDateForm"
									class="form-control"></td>
								<td><input type="text" name="effectiveDateTo"
									class="form-control"></td>
								<td><input type="text" name="userDef1" class="form-control" /></td>
								<td><input type="text" name="userDef2" class="form-control" /></td>
								<td><input type="text" name="userDef3" class="form-control" /></td>
								<td><input type="text" name="userDef4" class="form-control" /></td>
								<td><input type="text" name="userDef5" class="form-control" /></td>
							</tr>

						</tbody>
					</table>
				</form>
			</div>
		</div>





		<!-- Unnamed (Vertical Line) -->
      <div id="u320" class="ax_vertical_line">
        <img id="u320_start" class="img " src="resources/images/transparent.gif" alt="u320_start"/>
        <img id="u320_end" class="img " src="resources/images/transparent.gif" alt="u320_end"/>
        <img id="u320_line" class="img " src="images/login/u105_line.png" alt="u320_line"/>
      </div>
      
      
      <!-- Unnamed (HTML Button) -->
      <div id="u321" class="ax_html_button">
       <s:form action="Price_inExcel" method="post" enctype="multipart/form-data">
        <s:file name="priceEXCEL"/>
        <s:submit id="u321_input" name="上传" label="导入EXCEL" value="导入EXCEL"/>
       </s:form>
      </div>
      
      
      <form action="Price_outExcel">
      <!-- Unnamed (HTML Button) -->
      <div id="u322" class="ax_html_button">
        <input id="u322_input" type="submit" value="导出EXCEL"/>
      </div>
      </form>
    

      <!-- Unnamed (Horizontal Line) -->
      <div id="u324" class="ax_horizontal_line">
        <img id="u324_start" class="img " src="resources/images/transparent.gif" alt="u324_start"/>
        <img id="u324_end" class="img " src="resources/images/transparent.gif" alt="u324_end"/>
        <img id="u324_line" class="img " src="images/dingdanin/u136_line.png" alt="u324_line"/>
      </div>




      <!-- Unnamed (HTML Button) -->
      <div id="u329" class="ax_html_button">
        <input id="u329_input" type="submit" value="保存"/>
      </div>
    </div>

<script>    
$(document).ready(function() {
		$("#u322_input").click(function() {
			alert("将到出价格表到E盘根目录！")
		});
		
		//点击新增按钮
		//点击保存按钮
		$("#u329_input").click(function() {
			$("#addform").submit();
		});
		
	});
</script>
</body>
</html>
