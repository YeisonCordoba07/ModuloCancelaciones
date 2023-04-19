/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.udea.ejb;

import com.udea.modelo.SolicitudCancelacion;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author YEISON
 */
@Local
public interface SolicitudCancelacionManagerLocal {

    List<SolicitudCancelacion> getAllSolicitudes();

    SolicitudCancelacion update(SolicitudCancelacion solicitudCancelacion);
    
}
