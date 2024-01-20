package com.uce.edu.repository;

import com.uce.edu.repository.modelo.Mascota;

import java.util.List;

public interface IMascotaRepository {
    public List<Mascota> listarMascotas();
    public List<Mascota> listarMascotasPorTipo(String tipo);
    public void actualizarColorMascota(String nombre, String nuevoColor);
    public void eliminarMascotaPorId(Long id);
    public Long contarMascotas();
}
