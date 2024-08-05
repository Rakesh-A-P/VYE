package com.PageObjectManager.Entity;



import org.openqa.selenium.WebElement;

import com.Pages.Entity.*;


public class PageObjectManager {

	private loginPage loginpage;
	private LogoutPage LogoutPage;
	private EntityInformationPage EntityInformationPage;
	private EntityProviderIdentificationPage EntityProviderIdentificationPage;
	private EntityExclusionSanctionPage EntityExclusionSanctionPage;
    private EntityOwnershipPage EntityOwnershipPage;
    private EntityAllTheDropdownPage EntityAllTheDropdownPage;
    private EntityKeypersonalPage EntityKeypersonalPage;
    private EntityEFTInformationPage EntityEFTInformationPage;
    private EntityProgramParticipationPage EntityProgramParticipationPage;
    private EntityServiceLocationPage EntityServiceLocationPage;
    private EntityuploadphotoPage EntityuploadphotoPage;
    private EntitySummaryPage EntitySummaryPage;
    private EntityAddressdetailsPage EntityAddressdetailsPage;
    private EntityprovideragreementPage EntityprovideragreementPage;
    private EntityHealthHomeserivcePage EntityHealthHomeserivcePage;
    
//	
	public loginPage getLoginpage() {
		return (loginpage == null) ? loginpage = new loginPage() : loginpage;

	}
	public LogoutPage getLogoutPage() {
		return(LogoutPage==null)? LogoutPage=new LogoutPage():LogoutPage;
	}
	public EntityInformationPage getEntityInformationPage() {
		return (EntityInformationPage == null) ? EntityInformationPage = new EntityInformationPage() : EntityInformationPage;

	}
	public EntityProviderIdentificationPage getEntityProviderIdentificationPage() {
		return (EntityProviderIdentificationPage==null)? EntityProviderIdentificationPage=new EntityProviderIdentificationPage() : EntityProviderIdentificationPage;
		
	}
	public EntityExclusionSanctionPage getEntityExclusionSanctionPage() {
		
		return(EntityExclusionSanctionPage ==null) ? EntityExclusionSanctionPage=new EntityExclusionSanctionPage():EntityExclusionSanctionPage;
	}
	
	public EntityOwnershipPage getEntityOwnershipPage() {
		return(EntityOwnershipPage==null)?EntityOwnershipPage=new EntityOwnershipPage():EntityOwnershipPage;
	}
	public EntityAllTheDropdownPage getEntityAllTheDropdownPage() {
		return(EntityAllTheDropdownPage==null)?EntityAllTheDropdownPage=new EntityAllTheDropdownPage():EntityAllTheDropdownPage;
		}
	public EntityKeypersonalPage getEntityKeypersonalPage() {
		return (EntityKeypersonalPage==null)? EntityKeypersonalPage=new EntityKeypersonalPage():EntityKeypersonalPage;
	}
	public EntityEFTInformationPage getEntityEFTInformationPage() {
		return (EntityEFTInformationPage==null)? EntityEFTInformationPage=new EntityEFTInformationPage():EntityEFTInformationPage;
	}
	public EntityProgramParticipationPage getEntityProgramParticipationPage() {
		return (EntityProgramParticipationPage==null)? EntityProgramParticipationPage=new EntityProgramParticipationPage():EntityProgramParticipationPage;
	}
	public EntityuploadphotoPage getEntityuploadphotoPage() {
		return (EntityuploadphotoPage==null)? EntityuploadphotoPage =new EntityuploadphotoPage(): EntityuploadphotoPage;
	}
	public EntitySummaryPage getEntitySummaryPage() {
		return (EntitySummaryPage==null)? EntitySummaryPage =new EntitySummaryPage(): EntitySummaryPage;
	}
	public EntityServiceLocationPage getEntityServiceLocationPage() {
		return (EntityServiceLocationPage==null)? EntityServiceLocationPage=new EntityServiceLocationPage():EntityServiceLocationPage;
	}
	public EntityAddressdetailsPage getEntityAddressdetailsPage() {
		return (EntityAddressdetailsPage==null)? EntityAddressdetailsPage =new EntityAddressdetailsPage():EntityAddressdetailsPage;
	}
	public EntityprovideragreementPage getEntityprovideragreementPage() {
		return (EntityprovideragreementPage==null)? EntityprovideragreementPage=new EntityprovideragreementPage():EntityprovideragreementPage;
	}
	
	public EntityHealthHomeserivcePage getEntityHealthHomeserivcePage() {
		return (EntityHealthHomeserivcePage==null)? EntityHealthHomeserivcePage=new EntityHealthHomeserivcePage():EntityHealthHomeserivcePage;
	}
}