package UI;

import CompositeAndIterator.Hardware;

//The HardwareSearchResult class represents a search result for a hardware item.
class HardwareSearchResult {
    private final String stockType;
    private final Hardware hardware;

    public HardwareSearchResult(String stockType, Hardware hardware) {
        this.stockType = stockType;
        this.hardware = hardware;
    }

    public String getStockType() {
        return stockType;
    }

    public Hardware getHardware() {
        return hardware;
    }
}
