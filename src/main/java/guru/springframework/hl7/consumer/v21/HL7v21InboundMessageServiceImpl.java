package guru.springframework.hl7.consumer.v21;

import ca.uhn.hl7v2.model.Message;
import ca.uhn.hl7v2.model.v21.datatype.PN;
import ca.uhn.hl7v2.model.v21.message.ADT_A01;
import ca.uhn.hl7v2.model.v21.segment.MSH;

import guru.springframework.hl7.consumer.HL7InboundMessageService;
import org.springframework.stereotype.Service;

/**
 * Created by william.ott on 4/28/2016.
 */
@Service("hl7v21InboundService")
public class HL7v21InboundMessageServiceImpl implements HL7InboundMessageService<Message> {

    @Override
    public Message processMessage(Message hapiMsg) {
        System.out.println("#################################");
        System.out.println("#################################");
        System.out.println("#################################");
        System.out.println("#################################");
        System.out.println("I got a v21 HAPI message");
        ADT_A01 adtMsg = (ADT_A01)hapiMsg;
        MSH msh = adtMsg.getMSH();

        PN pn = adtMsg.getPID().getPATIENTNAME();

        System.out.println(pn.toString());
        return null;
    }
}
