/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.e3ti.cadsus.handlers;

import br.e3ti.cadsus.handlers.HeaderCnes;
import java.util.ArrayList;
import java.util.List;
import javax.xml.ws.handler.Handler;
import javax.xml.ws.handler.HandlerResolver;
import javax.xml.ws.handler.PortInfo;

/**
 *
 * @author erik
 */
public class ClientHandlerCnes implements HandlerResolver {

    @Override
    public List<javax.xml.ws.handler.Handler> getHandlerChain(PortInfo pi) {

        List<Handler> hchain = new ArrayList<>();
        hchain.add(new HeaderCnes()); //  soap handler defined in TestHandler.java dumps messages to stdout
        return hchain;

    }

}
