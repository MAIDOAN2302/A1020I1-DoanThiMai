package model.contract;

public class ContractDetail {
    private int id;
    private int contractId;
    private int attachService;
    private int quantity;

    public ContractDetail() {
    }

    public ContractDetail(int contractId, int attachService, int quantity) {
        this.contractId = contractId;
        this.attachService = attachService;
        this.quantity = quantity;
    }

    public ContractDetail(int id, int contractId, int attachService, int quantity) {
        this.id = id;
        this.contractId = contractId;
        this.attachService = attachService;
        this.quantity = quantity;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getContractId() {
        return contractId;
    }

    public void setContractId(int contractId) {
        this.contractId = contractId;
    }

    public int getAttachService() {
        return attachService;
    }

    public void setAttachService(int attachService) {
        this.attachService = attachService;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
}
