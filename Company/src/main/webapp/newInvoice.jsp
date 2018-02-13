<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
	<head>
		<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
		<meta name="viewport" content="width=device-width, initial-scale=1">
  		<link rel="stylesheet" href="/Company/node_modules/bootstrap/dist/css/bootstrap.css">
  		<script src="/Company/node_modules/jquery/dist/jquery.js"></script>
  		<script src="/Company/node_modules/bootstrap/dist/js/bootstrap.js"></script>
		<title>Firma Nova Faktura</title>
	</head>
	<body>
		<jsp:include page="/include/navigation.jsp">
			<jsp:param name="viewName" value="newInvoice"/>
		</jsp:include>
		<div class="container">
			<div class="row">
				<div class="col-sm-6">
					<div class="panel panel-primary">
				    	<div class="panel-heading"><h4>Dobavljac</h4></div>
				    	<div class="panel-body">
							<div class="form-horizontal">
								<label class="control-label col-sm-4" for="sellerNameText">Naziv:</label>
								<div class="col-sm-8">
									<p class="form-control-static" id="sellerNameText"><c:out value="${currentCompany.name}"></c:out></p>
								</div>
								<label class="control-label col-sm-4" for="sellerAddressText">Adresa:</label>
								<div class="col-sm-8">
									<p class="form-control-static" id="sellerAddressText"><c:out value="${currentCompany.address}"></c:out></p>
								</div>
								<label class="control-label col-sm-4" for="sellerPibText">Pib:</label>
								<div class="col-sm-8">
									<p class="form-control-static" id="sellerPibText"><c:out value="${currentCompany.pibNumber}"></c:out></p>
								</div>
							</div>							
						</div>
				    </div>
				</div>
				<div class="col-sm-6">
					<div class="panel panel-primary">
				    	<div class="panel-heading"><h4>Kupac</h4></div>
				    	<div class="panel-body">
							<div class="form-horizontal">
								<label class="control-label col-sm-4" for="buyerSelect">Naziv:</label>
								<div class="col-sm-8">
									<select class="form-control" id="buyerSelect"></select>
								</div>
								<label class="control-label col-sm-4" for="email">Adresa:</label>
								<div class="col-sm-8">
									<p class="form-control-static" id="buyerAddressText"></p>
								</div>
								<label class="control-label col-sm-4" for="email">Pib:</label>
								<div class="col-sm-8">
									<p class="form-control-static" id="buyerPibText"></p>
								</div>
							</div>							
						</div>
				    </div>
				</div>
				<div class="col-sm-6">
					<div class="panel panel-primary">
				    	<div class="panel-heading"><h4>Vrijednost</h4></div>
				    	<div class="panel-body">
							<div class="form-horizontal">
								<label class="control-label col-sm-3" for="email">Robe:</label>
								<div class="col-sm-9">
									<p class="form-control-static">xxx</p>
								</div>
								<label class="control-label col-sm-3" for="email">Usluga:</label>
								<div class="col-sm-9">
									<p class="form-control-static">yyy</p>
								</div>
								<label class="control-label col-sm-3" for="email">Robe i usluga:</label>
								<div class="col-sm-9">
									<p class="form-control-static">zzzz</p>
								</div>
								<label class="control-label col-sm-3" for="email">Ukupan rabat:</label>
								<div class="col-sm-9">
									<p class="form-control-static">tt</p>
								</div>
								<label class="control-label col-sm-3" for="email">Ukupan porez:</label>
								<div class="col-sm-9">
									<p class="form-control-static">ss</p>
								</div>
								<label class="control-label col-sm-3" for="email">Za uplatu:</label>
								<div class="col-sm-9">
									<p class="form-control-static">wwwww</p>
								</div>
							</div>							
						</div>
				    </div>
				</div>
				<div class="col-sm-6">
					<div class="panel panel-primary">
				    	<div class="panel-heading"><h4>Uplata na racun</h4></div>
				    	<div class="panel-body">
							<div class="form-horizontal">
								<label class="control-label col-sm-4" for="email">Broj:</label>
								<div class="col-sm-8">
									<select class="form-control">
										<option>1</option>
										<option>2</option>
									</select>
								</div>
								<label class="control-label col-sm-4" for="email">Valuta:</label>
								<div class="col-sm-8">
									<p class="form-control-static">RSD</p>
								</div>
								<div class="col-sm-offset-4 col-sm-3">
									<button class="btn btn-lg btn-success">Posalji Fakturu</button>
								</div>
							</div>							
						</div>
				    </div>
				</div>
				<div class="col-sm-12">
					<div class="panel panel-primary">
				    	<div class="panel-heading"><h4>Komande</h4></div>
				    	<div class="panel-body">
							<div class="form-horizontal">
								<div class="col-sm-offset-10">
									<button class="btn btn-success pull-right" data-toggle="modal" data-target="#novaStavkaDijalog"><span class="glyphicon glyphicon-plus"></span> Nova Stavka</button>
								</div>
							</div>							
						</div>
				    </div>
				</div>
			</div>
			<div class="modal fade" id="novaStavkaDijalog" role="dialog">
				<div class="modal-dialog">
					<div class="modal-content">
						<div class="modal-header">
							<button type="button" class="close" data-dismiss="modal">&times;</button>
							<h4 class="modal-title">Modal Header</h4>
						</div>
						<div class="modal-body">
							<div class="form-horizontal">
								<div class="form-group">
									<label class="control-label col-sm-4" for="dodajStavkuSelect">Nova Stavka:</label>
									<div class="col-sm-8">
										<select id="dodajStavkuSelect" class="form-control"></select>
									</div>
								</div>
							</div>
						</div>
						<div class="modal-footer">
							<button type="button" class="btn btn-success" id="modalAddButton">Dodaj</button>
							<button type="button" class="btn btn-default" data-dismiss="modal">Zatvori</button>
						</div>
					</div>
				</div>
			</div>
		</div>
		<script type="text/javascript">
		$(document).ready(function(){
			var companyData = ${currentCompanyJson};
			var otherCompanies = ${otherCompaniesJson};
			var setTextAndPib = function(addressElement, pibElement, company) {
				addressElement.text(company.address);
				pibElement.text(company.pibNumber);
			}
			var appendBuyerCompany = function(buyerSelectElement, buyerAddressTextElement,
					buyerPibTextElement, company, isSelected) {
				var selectedText = isSelected?' selected ':' ';
				buyerSelectElement.append(
					'<option' +  
					selectedText + 
					'value="' + 
					company.id + 
					'">' + 
					company.name + 
					'</option>'
				);
				if(isSelected) {
					setTextAndPib(buyerAddressTextElement, buyerPibTextElement, company);
				}
			}
			if(otherCompanies.length > 0) {
				var buyerSelect = $('#buyerSelect');
				var buyerAddressText = $('#buyerAddressText');
				var buyerPibText = $('#buyerPibText');
				var otherCompaniesHead = otherCompanies[0];
				var otherCompaniesTail = otherCompanies.slice(1, otherCompanies.length);
				buyerSelect.change(function(event) {
					var optionSelected = $("option:selected", this);
				    var valueSelected = this.value;
				    var numSelected = parseInt(valueSelected);
				    var newCompany = otherCompanies.find(function(company) {
				    	return company.id === numSelected;
				    });
				    console.log(newCompany);
				    setTextAndPib(buyerAddressText, buyerPibText, newCompany);
				});
				appendBuyerCompany(buyerSelect, buyerAddressText, buyerPibText, otherCompaniesHead, true);
				otherCompaniesTail.forEach(function(element) {
					appendBuyerCompany(buyerSelect, buyerAddressText, buyerPibText, element, false);
				});
			}
			var offeringData = [];
			companyData.offeringGroups.forEach(function(offeringGroup) {
				offeringGroup.offerings.forEach(function(offering) {
					var offeringDiscountPercentage = (offering.discountPercentage)?(offering.discountPercentage):(0.00);
					var offeringDiscountAmmount = (offering.discountAmmount)?(offering.discountAmmount):(0.00);
					
					var offeringGroupDiscountPercentage = (offeringGroup.discountPercentage)?(offeringGroup.discountPercentage):(0.00);
					var offeringGroupDiscountAmmount = (offeringGroup.discountAmmount)?(offeringGroup.discountAmmount):(0.00);
					
					var discountPercentage = offeringDiscountPercentage + offeringGroupDiscountPercentage;
					var discountAmmount = offeringDiscountAmmount + offeringGroupDiscountAmmount;
					
					var unitPrice = offering.unitPrice;
					var discountPercentageAmount = unitPrice * discountPercentage / 100;
					
					var discountTotal = (discountPercentageAmount > discountAmmount)?(discountPercentageAmount):(discountAmmount);
					
					offeringData.push({
						"id" : offering.id,
						"name" : offering.name,
						"type" : offering.type,
						"unitPrice" : unitPrice,
						"discountPercentage" : discountPercentage,
						"discountAmmount" : discountAmmount,
						"discountPercentageAmount": discountPercentageAmount,
						"discountTotal" : discountTotal,
						"unitOfMeasurement" : offering.unitOfMeasurement
					});
				}); 
			});
			console.log(offeringData)
			var freeOfferingData = [];
			offeringData.forEach(function(element) {
				freeOfferingData.push(element);
			});
			$("#novaStavkaDijalog").on('shown.bs.modal', function () {
	            var dodajStavkuSelect = $('#dodajStavkuSelect');
	            dodajStavkuSelect.empty();
	            freeOfferingData.forEach(function(element) {
	            	dodajStavkuSelect.append(
            			'<option value="' + 
    					element.id + 
    					'">' + 
    					element.name + 
    					'</option>'
	            	);
	            });
		    });
			
			var createNewItemView = function(container, item) {
				container.append('<div class="row"></div>');
			};
			
			$('#modalAddButton').click(function(event) {
				var dodajStavkuSelect = $('#dodajStavkuSelect');
				var selectedValue = dodajStavkuSelect.find(':selected').val();
				var selectedNum = parseInt(selectedValue);
				var selectedIndex = freeOfferingData.findIndex(function(item) {
					return item.id == selectedNum;
				});
				var selectedItem = freeOfferingData[selectedIndex];
				freeOfferingData.splice(selectedIndex, 1);
				var container = $($('.container')[0]);
				container.append('<div class="row">' + 
						'	<div class="col-sm-12">' +
						'		<div class="panel panel-primary">' +
						'			<div class="panel-heading clearfix">' +
						'				<h4 class="panel-title pull-left" style="padding-top: 7.5px;">Stavka #1</h4>' +
						'				<div class="btn-group pull-right">' +
						'					<a type="button" class="btn btn-success btn-sm"><span class="glyphicon glyphicon-arrow-up"></span></a>' +
						'					<a type="button" class="btn btn-success btn-sm"><span class="glyphicon glyphicon-arrow-down"></span></a>' +
						'					<a type="button" class="btn btn-danger btn-sm"><span class="glyphicon glyphicon-remove"></span></a>' +
						'				</div>' +
						'			</div>' +
						'			<div class="panel-body">' +
						'				<div class="form-horizontal">' +
						'					<label class="control-label col-sm-2" for="email">Kolicina:</label>' +
						'					<div class="col-sm-10">' +
						'						<input type="number" class="form-control">' +
						'					</div>' +
						'					<label class="control-label col-sm-2" for="email">Jedinicna cijena:</label>' +
						'					<div class="col-sm-10">' +
						'						<p class="form-control-static item-unit-price"></p>' +
						'					</div>' +
						'					<label class="control-label col-sm-2" for="email">Vrijednost:</label>' +
						'					<div class="col-sm-10">' +
						'						<p class="form-control-static item-total-value"></p>' +
						'					</div>' +
						'					<label class="control-label col-sm-2" for="email">Procenat rabata:</label>' +
						'					<div class="col-sm-10">' +
						'						<p class="form-control-static item-discount-percentage"></p>' +
						'					</div>' +
						'					<label class="control-label col-sm-2" for="email">Iznos rabata:</label>' +
						'					<div class="col-sm-10">' +
						'						<p class="form-control-static item-discount-amount"></p>' +
						'					</div>' +
						'					<label class="control-label col-sm-2" for="email">Ukupan rabat:</label>' +
						'					<div class="col-sm-10">' +
						'						<p class="form-control-static item-discount-total-amount"></p>' +
						'					</div>' +
						'					<label class="control-label col-sm-2" for="email">Umanjeno za rabat:</label>' +
						'					<div class="col-sm-10">' +
						'						<p class="form-control-static item-tax-base"></p>' +
						'					</div>' +
						'					<label class="control-label col-sm-2" for="email">Ukupan porez:</label>' +
						'					<div class="col-sm-10">' +
						'						<p class="form-control-static item-tax"></p>' +
						'					</div>' +
						'					<label class="control-label col-sm-2" for="email">Jedinica mjere:</label>' +
						'					<div class="col-sm-10">' +
						'						<p class="form-control-static item-measure"></p>' +
						'					</div>' +
						'				</div>' +
						'			</div>' +
						'		</div>' +
						'	</div>' +
						'</div>');
				$("#novaStavkaDijalog").modal('hide');
			});
		});
		</script>
	</body>
</html>