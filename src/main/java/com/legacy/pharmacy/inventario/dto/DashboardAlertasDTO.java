package com.legacy.pharmacy.inventario.dto;

import lombok.Builder;
import lombok.Data;
import java.util.List;
import java.util.Map;

@Data
@Builder
public class DashboardAlertasDTO {
    private long totalVencidos;
    private long totalPorVencer;
    private long totalStockBajo;
    private long totalSaludables;
    private List<Map<String, Object>> productosBajoStock;
}