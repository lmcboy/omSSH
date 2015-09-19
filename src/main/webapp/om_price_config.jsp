<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@page import="java.util.ArrayList"%>
<%@page import="java.util.List"%>
<%@page import="com.ssh.model.OmCustPriceListConfig" %>
<%@page import="com.ssh.model.OmCustomersInfo" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>价格表配置查询/编辑</title>
<meta http-equiv="X-UA-Compatible" content="IE=edge" />
<meta http-equiv="content-type" content="text/html; charset=utf-8" />
<meta name="apple-mobile-web-app-capable" content="yes" />
<link href="myCss/bootstrap.min.css" type="text/css" rel="stylesheet"/>
<link href="resources/css/jquery-ui-themes.css" type="text/css"
	rel="stylesheet" />
<link href="resources/css/axure_rp_page.css" type="text/css"
	rel="stylesheet" />
<link href="data/styles.css" type="text/css" rel="stylesheet" />
<link href="files/价格表配置查询_编辑/styles.css" type="text/css"
	rel="stylesheet" />
<link href="myCss/myCss.css" type="text/css" rel="stylesheet"/>
<script src="resources/scripts/jquery-1.7.1.min.js"></script>
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
<script src="files/价格表配置查询_编辑/data.js"></script>
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
<% List<OmCustPriceListConfig> pc = new ArrayList<OmCustPriceListConfig>(); 
pc=(List<OmCustPriceListConfig>)session.getAttribute("pc");
%>
	<div id="base" class="">

		<!-- Unnamed (Shape) -->
		<div id="u2" class="ax_h1">
			<img id="u2_img" class="img " src="resources/images/transparent.gif" />
			<!-- Unnamed () -->
			<div id="u3" class="text">
				<p>
					<span>销售订单管理系统</span>
				</p>
			</div>
		</div>

		<!-- Unnamed (Image) -->
		<div id="u4" class="ax_image">
			<img id="u4_img" class="img " src="images/登录/u2.png" />
			<!-- Unnamed () -->
			<div id="u5" class="text">
				<p>
					<span></span>
				</p>
			</div>
		</div>

		<!-- Unnamed (Horizontal Line) -->
		<div id="u6" class="ax_horizontal_line">
			<img id="u6_start" class="img "
				src="resources/images/transparent.gif" alt="u6_start" /> <img
				id="u6_end" class="img " src="resources/images/transparent.gif"
				alt="u6_end" /> <img id="u6_line" class="img "
				src="images/登录/u4_line.png" alt="u6_line" />
		</div>

		<!-- Unnamed (Tree) -->
		<div id="u7" class="ax_tree_node treeroot">
			<div id="u7_children" class="u7_children">

				<!-- Unnamed (Tree Node) -->
				<div id="u8" class="ax_tree_node treenode">
					<!-- Unnamed (Shape) -->
					<div id="u9" class="" selectiongroup="u7_tree_group">
						<img id="u9_img" class="img "
							src="resources/images/transparent.gif" />
						<!-- Unnamed () -->
						<div id="u10" class="text">
							<p>
								<span>首页</span>
							</p>
						</div>
					</div>
				</div>

				<!-- Unnamed (Tree Node) -->
				<div id="u11" class="ax_tree_node treenode">

					<!-- Unnamed (Image) -->
					<div id="u12" class="ax_image">
						<img id="u12_img" class="img " src="images/登录/u10.png" />
						<!-- Unnamed () -->
						<div id="u13" class="text">
							<p>
								<span></span>
							</p>
						</div>
					</div>
					<!-- Unnamed (Shape) -->
					<div id="u14" class="" selectiongroup="u7_tree_group">
						<img id="u14_img" class="img "
							src="resources/images/transparent.gif" />
						<!-- Unnamed () -->
						<div id="u15" class="text">
							<p>
								<span>销售订单管理</span>
							</p>
						</div>
					</div>
					<div id="u11_children" class="u11_children"
						style="visibility: hidden;">

						<!-- Unnamed (Tree Node) -->
						<div id="u16" class="ax_tree_node treenode">
							<!-- Unnamed (Shape) -->
							<div id="u17" class="" selectiongroup="u7_tree_group">
								<img id="u17_img" class="img "
									src="resources/images/transparent.gif" />
								<!-- Unnamed () -->
								<div id="u18" class="text">
									<p>
										<span>Item 1.1</span>
									</p>
								</div>
							</div>
						</div>

						<!-- Unnamed (Tree Node) -->
						<div id="u19" class="ax_tree_node treenode">
							<!-- Unnamed (Shape) -->
							<div id="u20" class="" selectiongroup="u7_tree_group">
								<img id="u20_img" class="img "
									src="resources/images/transparent.gif" />
								<!-- Unnamed () -->
								<div id="u21" class="text">
									<p>
										<span>Item 1.2</span>
									</p>
								</div>
							</div>
						</div>

						<!-- Unnamed (Tree Node) -->
						<div id="u22" class="ax_tree_node treenode">
							<!-- Unnamed (Shape) -->
							<div id="u23" class="" selectiongroup="u7_tree_group">
								<img id="u23_img" class="img "
									src="resources/images/transparent.gif" />
								<!-- Unnamed () -->
								<div id="u24" class="text">
									<p>
										<span>Item 1.3</span>
									</p>
								</div>
							</div>
						</div>
					</div>
				</div>

				<!-- Unnamed (Tree Node) -->
				<div id="u25" class="ax_tree_node treenode">

					<!-- Unnamed (Image) -->
					<div id="u26" class="ax_image">
						<img id="u26_img" class="img " src="images/登录/u10.png" />
						<!-- Unnamed () -->
						<div id="u27" class="text">
							<p>
								<span></span>
							</p>
						</div>
					</div>
					<!-- Unnamed (Shape) -->
					<div id="u28" class="" selectiongroup="u7_tree_group">
						<img id="u28_img" class="img "
							src="resources/images/transparent.gif" />
						<!-- Unnamed () -->
						<div id="u29" class="text">
							<p>
								<span>发货单管理</span>
							</p>
						</div>
					</div>
					<div id="u25_children" class="u25_children"
						style="visibility: hidden;">

						<!-- Unnamed (Tree Node) -->
						<div id="u30" class="ax_tree_node treenode">
							<!-- Unnamed (Shape) -->
							<div id="u31" class="" selectiongroup="u7_tree_group">
								<img id="u31_img" class="img "
									src="resources/images/transparent.gif" />
								<!-- Unnamed () -->
								<div id="u32" class="text">
									<p>
										<span>输入文本...</span>
									</p>
								</div>
							</div>
						</div>

						<!-- Unnamed (Tree Node) -->
						<div id="u33" class="ax_tree_node treenode">
							<!-- Unnamed (Shape) -->
							<div id="u34" class="" selectiongroup="u7_tree_group">
								<img id="u34_img" class="img "
									src="resources/images/transparent.gif" />
								<!-- Unnamed () -->
								<div id="u35" class="text">
									<p>
										<span>输入文本...</span>
									</p>
								</div>
							</div>
						</div>
					</div>
				</div>

				<!-- Unnamed (Tree Node) -->
				<div id="u36" class="ax_tree_node treenode">

					<!-- Unnamed (Image) -->
					<div id="u37" class="ax_image">
						<img id="u37_img" class="img " src="images/登录/u10.png" />
						<!-- Unnamed () -->
						<div id="u38" class="text">
							<p>
								<span></span>
							</p>
						</div>
					</div>
					<!-- Unnamed (Shape) -->
					<div id="u39" class="" selectiongroup="u7_tree_group">
						<img id="u39_img" class="img "
							src="resources/images/transparent.gif" />
						<!-- Unnamed () -->
						<div id="u40" class="text">
							<p>
								<span>制单界面</span>
							</p>
						</div>
					</div>
					<div id="u36_children" class="u36_children"
						style="visibility: hidden;">

						<!-- Unnamed (Tree Node) -->
						<div id="u41" class="ax_tree_node treenode">
							<!-- Unnamed (Shape) -->
							<div id="u42" class="" selectiongroup="u7_tree_group">
								<img id="u42_img" class="img "
									src="resources/images/transparent.gif" />
								<!-- Unnamed () -->
								<div id="u43" class="text">
									<p>
										<span>输入文本...</span>
									</p>
								</div>
							</div>
						</div>
					</div>
				</div>

				<!-- Unnamed (Tree Node) -->
				<div id="u44" class="ax_tree_node treenode">

					<!-- Unnamed (Image) -->
					<div id="u45" class="ax_image">
						<img id="u45_img" class="img " src="images/登录/u10.png" />
						<!-- Unnamed () -->
						<div id="u46" class="text">
							<p>
								<span></span>
							</p>
						</div>
					</div>
					<!-- Unnamed (Shape) -->
					<div id="u47" class="" selectiongroup="u7_tree_group">
						<img id="u47_img" class="img "
							src="resources/images/transparent.gif" />
						<!-- Unnamed () -->
						<div id="u48" class="text">
							<p>
								<span>O</span><span>rderbase维护</span>
							</p>
						</div>
					</div>
					<div id="u44_children" class="u44_children"
						style="visibility: hidden;">

						<!-- Unnamed (Tree Node) -->
						<div id="u49" class="ax_tree_node treenode">
							<!-- Unnamed (Shape) -->
							<div id="u50" class="" selectiongroup="u7_tree_group">
								<img id="u50_img" class="img "
									src="images/orderbase___4/u51.png" />
								<!-- Unnamed () -->
								<div id="u51" class="text">
									<p>
										<span>O</span><span>rderbase</span><span>查询</span>
									</p>
								</div>
							</div>
						</div>

						<!-- Unnamed (Tree Node) -->
						<div id="u52" class="ax_tree_node treenode">
							<!-- Unnamed (Shape) -->
							<div id="u53" class="" selectiongroup="u7_tree_group">
								<img id="u53_img" class="img "
									src="resources/images/transparent.gif" />
								<!-- Unnamed () -->
								<div id="u54" class="text">
									<p>
										<span>O</span><span>rderbase</span><span>编辑</span>
									</p>
								</div>
							</div>
						</div>

						<!-- Unnamed (Tree Node) -->
						<div id="u55" class="ax_tree_node treenode">
							<!-- Unnamed (Shape) -->
							<div id="u56" class="" selectiongroup="u7_tree_group">
								<img id="u56_img" class="img "
									src="resources/images/transparent.gif" />
								<!-- Unnamed () -->
								<div id="u57" class="text">
									<p>
										<span>O</span><span>rderbase</span><span>导入</span>
									</p>
								</div>
							</div>
						</div>
					</div>
				</div>

				<!-- Unnamed (Tree Node) -->
				<div id="u58" class="ax_tree_node treenode">

					<!-- Unnamed (Image) -->
					<div id="u59" class="ax_image">
						<img id="u59_img" class="img " src="images/登录/u10.png" />
						<!-- Unnamed () -->
						<div id="u60" class="text">
							<p>
								<span></span>
							</p>
						</div>
					</div>
					<!-- Unnamed (Shape) -->
					<div id="u61" class="" selectiongroup="u7_tree_group">
						<img id="u61_img" class="img "
							src="resources/images/transparent.gif" />
						<!-- Unnamed () -->
						<div id="u62" class="text">
							<p>
								<span>主数据维护</span>
							</p>
						</div>
					</div>
					<div id="u58_children" class="u58_children"
						style="visibility: hidden;">

						<!-- Unnamed (Tree Node) -->
						<div id="u63" class="ax_tree_node treenode">
							<!-- Unnamed (Shape) -->
							<div id="u64" class="" selectiongroup="u7_tree_group">
								<img id="u64_img" class="img "
									src="resources/images/transparent.gif" />
								<!-- Unnamed () -->
								<div id="u65" class="text">
									<p>
										<span>客户管理</span>
									</p>
								</div>
							</div>
						</div>

						<!-- Unnamed (Tree Node) -->
						<div id="u66" class="ax_tree_node treenode">
							<!-- Unnamed (Shape) -->
							<div id="u67" class="" selectiongroup="u7_tree_group">
								<img id="u67_img" class="img " src="images/价格表配置查询_编辑/u67.png" />
								<!-- Unnamed () -->
								<div id="u68" class="text">
									<p>
										<span>价格表管理</span>
									</p>
								</div>
							</div>
						</div>
					</div>
				</div>

				<!-- Unnamed (Tree Node) -->
				<div id="u69" class="ax_tree_node treenode">

					<!-- Unnamed (Image) -->
					<div id="u70" class="ax_image">
						<img id="u70_img" class="img " src="images/登录/u10_selected.png" />
						<!-- Unnamed () -->
						<div id="u71" class="text">
							<p>
								<span></span>
							</p>
						</div>
					</div>
					<!-- Unnamed (Shape) -->
					<div id="u72" class="" selectiongroup="u7_tree_group">
						<img id="u72_img" class="img "
							src="resources/images/transparent.gif" />
						<!-- Unnamed () -->
						<div id="u73" class="text">
							<p>
								<span>系统设置</span>
							</p>
						</div>
					</div>
					<div id="u69_children" class="u69_children">

						<!-- Unnamed (Tree Node) -->
						<div id="u74" class="ax_tree_node treenode">
							<!-- Unnamed (Shape) -->
							<div id="u75" class="" selectiongroup="u7_tree_group">
								<img id="u75_img" class="img " src="images/价格表配置查询_编辑/u75.png" />
								<!-- Unnamed () -->
								<div id="u76" class="text">
									<p>
										<span>O</span><span>r</span><span>derbase</span><span>配置</span>
									</p>
								</div>
							</div>
						</div>

						<!-- Unnamed (Tree Node) -->
						<div id="u77" class="ax_tree_node treenode">
							<!-- Unnamed (Shape) -->
							<div id="u78" class="" selectiongroup="u7_tree_group">
								<img id="u78_img" class="img "
									src="resources/images/transparent.gif" />
								<!-- Unnamed () -->
								<div id="u79" class="text">
									<p>
										<span>客户订单配置</span>
									</p>
								</div>
							</div>
						</div>

						<!-- Unnamed (Tree Node) -->
						<div id="u80" class="ax_tree_node treenode">
							<!-- Unnamed (Shape) -->
							<div id="u81" class="" selectiongroup="u7_tree_group">
								<img id="u81_img" class="img " src="images/价格表配置查询_编辑/u81.png" />
								<!-- Unnamed () -->
								<div id="u82" class="text">
									<p>
										<span>价格表配置</span>
									</p>
								</div>
							</div>
						</div>
					</div>
				</div>

				<!-- Unnamed (Tree Node) -->
				<div id="u83" class="ax_tree_node treenode">

					<!-- Unnamed (Image) -->
					<div id="u84" class="ax_image">
						<img id="u84_img" class="img " src="images/登录/u10.png" />
						<!-- Unnamed () -->
						<div id="u85" class="text">
							<p>
								<span></span>
							</p>
						</div>
					</div>
					<!-- Unnamed (Shape) -->
					<div id="u86" class="" selectiongroup="u7_tree_group">
						<img id="u86_img" class="img "
							src="resources/images/transparent.gif" />
						<!-- Unnamed () -->
						<div id="u87" class="text">
							<p>
								<span>用户管理</span>
							</p>
						</div>
					</div>
					<div id="u83_children" class="u83_children"
						style="visibility: hidden;">

						<!-- Unnamed (Tree Node) -->
						<div id="u88" class="ax_tree_node treenode">
							<!-- Unnamed (Shape) -->
							<div id="u89" class="" selectiongroup="u7_tree_group">
								<img id="u89_img" class="img "
									src="resources/images/transparent.gif" />
								<!-- Unnamed () -->
								<div id="u90" class="text">
									<p>
										<span>输入文本...</span>
									</p>
								</div>
							</div>
						</div>
					</div>
				</div>

				<!-- Unnamed (Tree Node) -->
				<div id="u91" class="ax_tree_node treenode">

					<!-- Unnamed (Image) -->
					<div id="u92" class="ax_image">
						<img id="u92_img" class="img " src="images/登录/u10.png" />
						<!-- Unnamed () -->
						<div id="u93" class="text">
							<p>
								<span></span>
							</p>
						</div>
					</div>
					<!-- Unnamed (Shape) -->
					<div id="u94" class="" selectiongroup="u7_tree_group">
						<img id="u94_img" class="img "
							src="resources/images/transparent.gif" />
						<!-- Unnamed () -->
						<div id="u95" class="text">
							<p>
								<span>权限管理</span>
							</p>
						</div>
					</div>
					<div id="u91_children" class="u91_children"
						style="visibility: hidden;">

						<!-- Unnamed (Tree Node) -->
						<div id="u96" class="ax_tree_node treenode">
							<!-- Unnamed (Shape) -->
							<div id="u97" class="" selectiongroup="u7_tree_group">
								<img id="u97_img" class="img "
									src="resources/images/transparent.gif" />
								<!-- Unnamed () -->
								<div id="u98" class="text">
									<p>
										<span>输入文本...</span>
									</p>
								</div>
							</div>
						</div>
					</div>
				</div>
			</div>
		</div>

		<!-- Unnamed (Tree) -->
		<div id="u99" class="ax_tree_node treeroot">
			<div id="u99_children" class="u99_children">

				<!-- Unnamed (Tree Node) -->
				<div id="u100" class="ax_tree_node treenode">
					<!-- Unnamed (Shape) -->
					<div id="u101" class="" selectiongroup="u99_tree_group">
						<img id="u101_img" class="img "
							src="resources/images/transparent.gif" />
						<!-- Unnamed () -->
						<div id="u102" class="text">
							<p>
								<span></span>
							</p>
						</div>
					</div>
				</div>
			</div>
		</div>

		<!-- Unnamed (Tree) -->
		<div id="u103" class="ax_tree_node treeroot">
			<div id="u103_children" class="u103_children">

				<!-- Unnamed (Tree Node) -->
				<div id="u104" class="ax_tree_node treenode">
					<!-- Unnamed (Shape) -->
					<div id="u105" class="" selectiongroup="u103_tree_group">
						<img id="u105_img" class="img "
							src="resources/images/transparent.gif" />
						<!-- Unnamed () -->
						<div id="u106" class="text">
							<p>
								<span></span>
							</p>
						</div>
					</div>
				</div>
			</div>
		</div>


		<!-- Unnamed (Shape) -->
		<div id="u108" class="ax_h1">
			<img id="u108_img" class="img "
				src="resources/images/transparent.gif" />
			<!-- Unnamed () -->
			<div id="u109" class="text">
				<p>
					<span>系统设置</span><span>&gt;</span><span>价格表配</span><span>置</span>
				</p>
			</div>
		</div>

		<!-- Unnamed (Horizontal Line) -->
		<div id="u110" class="ax_horizontal_line">
			<img id="u110_start" class="img "
				src="resources/images/transparent.gif" alt="u110_start" /> <img
				id="u110_end" class="img " src="resources/images/transparent.gif"
				alt="u110_end" /> <img id="u110_line" class="img "
				src="images/登录/u104_line.png" alt="u110_line" />
		</div>

		<!-- Unnamed (Shape) -->
		<div id="u111" class="ax_paragraph">
			<img id="u111_img" class="img "
				src="resources/images/transparent.gif" />
			<!-- Unnamed () -->
			<div id="u112" class="text">
				<p>
					<span>客户</span><span>ID</span>
				</p>
			</div>
		</div>


		<form action="PriceConfig_getPc" >
			<!-- Unnamed (Text Field) -->
			<div id="u107" class="ax_text_field">
				<input id="u107_input" type="text" name="custId" value="${custId}" />
			</div>

			<!-- Unnamed (HTML Button) -->
			<div id="u116" class="ax_html_button">
				<input id="u116_input" type="submit" value="查询/修改" />
			</div>
		</form>

		<!-- Unnamed (Table) -->
		<div id="my117" class="ax_table">
			<div class="row">
				<table class="table table-bordered table-striped table-hover" >
					<thead>
						<tr >
							<th>序列</th>
							<th>PL列名</th>
						</tr>
						<tr height="42px">
							<th>1</th>
							<th>PL_YH_ITEM</th>
						</tr>
						<tr height="42px">
							<th>2</th>
							<th>effective_date_from
						</tr>
						<tr height="42px">
							<th>3</th>
							<th>effective_date_to</th>
						</tr>
						<%for(int i=4;i<=8;i++){ %>
						<tr height="42px">
							<th><%=i%></th>
							<th>user_def<%=i-3%></th>
						</tr>
						<%} %>
					</thead>	
				</table>
			</div>
		</div>
		<form action="PriceConfig_updateAdd">
		<div id="my118" class="ax_table">
			<div class="row">
				<table class="table table-bordered table-striped table-hover" >
					<thead>
						<tr>
							<th>显示名称</th>
							<th>EXCEL列</th>
							<th>启用</th>
						</tr>
						<%
							for (int j = 0; j < pc.size(); j++) {
						%>
						<tr>
						    <input type="hidden" value="<%=pc.get(j).getPlcId()%>" name="plcid" />
							<th><input value="<%=pc.get(j).getDisplayName()%>" name="dname" /></th>
							<th><input value="<%=pc.get(j).getExcelCol()%>" name="excel" /></th>
							<th>
							<%if(pc.get(j).getActivity().equals("1")){%>
							<input type="checkbox" name="activity" value="1" checked />
							<%}else{ %>
							<input type="checkbox" name="activity" value="0" />
							<%} %>
							</th>
						</tr>
						<%
							}
						%>
						<%for(int k=pc.size();k<8;k++){%>
						<tr height="42px">
							<th><input name="dname" /></th>
							<th><input name="excel" /></th>
							<th><input type="checkbox" name="activity" value="0" /></th>
						</tr>
						<%} %>
						
					</thead>
				</table>
			</div>
		</div>
		<input type="hidden" name="act" id="act" value=""/>
		
		<!-- Unnamed (HTML Button) -->
		<div id="u215" class="ax_html_button">
			<input id="u215_input" type="submit" value="保存" />
		</div>
		</form>
		
		
		





		<!-- Unnamed (Vertical Line) -->
		<div id="u213" class="ax_vertical_line">
			<img id="u213_start" class="img "
				src="resources/images/transparent.gif" alt="u213_start" /> <img
				id="u213_end" class="img " src="resources/images/transparent.gif"
				alt="u213_end" /> <img id="u213_line" class="img "
				src="images/登录/u105_line.png" alt="u213_line" />
		</div>


		<!-- Unnamed (Horizontal Line) -->
		<div id="u225" class="ax_horizontal_line">
			<img id="u225_start" class="img "
				src="resources/images/transparent.gif" alt="u225_start" /> <img
				id="u225_end" class="img " src="resources/images/transparent.gif"
				alt="u225_end" /> <img id="u225_line" class="img "
				src="images/订单导入/u136_line.png" alt="u225_line" />
		</div>



		

		

	</div>
	
<script>

	$(document).ready(function() {
		$("#u215_input").click(function() {
			var result = [];
			alert("");
			$("input[type='checkbox']").each(function() {
				var num = this.checked ? 1 : 0;
				result.push(num);
			});
			$("#act").attr("value", result);
		});
	});
</script>

</body>
</html>
