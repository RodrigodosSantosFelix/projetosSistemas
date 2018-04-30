using System.Collections;
using System.Collections.Generic;
using UnityEngine;
/*
 * Esse script faz com que a camera mova junto
 * com o player, nesse caso, junto com a bola.
 */
public class CameraController : MonoBehaviour
{
    public GameObject player;

    private Vector3 offset;

    void Start ()
    {
        offset = transform.position - player.transform.position; 
        //Transforma a posição menos a posição de Transformação do jogador.
    }

    void LateUpdate () //LateUpdate é executado em todos os quadros,
        //assim como no Update
        //Mas é garantido para correr rdepois de todos os itens forem processados na atualização

    {
        transform.position = player.transform.position + offset;
        //Quando nosso jogador
        //com os controles do teclado que cada quadro antes de exibir o que a camera pode ver.
        //A camera é movida para uma nova posição, Alinhado com o objectPlayer
    }
}